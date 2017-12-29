/*
 * 
 */
package com.yuranos.session;

import com.yuranos.session.model.Basket;
import com.yuranos.session.model.OperationTypeEnum;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * The Class SessionCleanupSchedulerJob.<br>
 * This component is responsible for cleaning up the irrelevant sessions basket from Session Collection in MongoDB.
 * The age of the Session is configurable.
 */
@Component
public class SessionCleanUpSchedulerJob {

    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private static final int DEFAULT_QUERY_PAGE_SIZE = 1;
    private static final String SUCCESS = "SUCCESS";
    private final SessionService sessionService;
    @Value("${com.yuranos.session.basket.expire.days:10}")
    private int expireDays;

    @Autowired
    public SessionCleanUpSchedulerJob(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    /*
     * (non-Javadoc)
     * @see org.mule.api.lifecycle.Callable#onCall(org.mule.api.MuleEventContext)
     */
    public Object onCall() throws SessionException {
        LOG.info("Session Cleanup cron job running...");

        boolean pendingPagesToProcess = true;
        ZonedDateTime from = ZonedDateTime.now().minusDays(expireDays);

        while (pendingPagesToProcess) {
            pendingPagesToProcess = removeUnBookedSessionsForPage(from);
        }

        LOG.info("Session Cleanup cron job successfully completed...");
        return SUCCESS;
    }

    private boolean removeUnBookedSessionsForPage(ZonedDateTime from) throws SessionException {
        Map<String, Basket> sessionsToDeleteInCurrentPage =
                sessionService.findEligibleBasketsToBeDeletedOff(Date.from(from.toInstant()), DEFAULT_QUERY_PAGE_SIZE);

        List<String> sessionsToBeDeleted = new ArrayList<>();
        List<String> booksToBeUpdated = new ArrayList<>();

        sessionsToDeleteInCurrentPage.entrySet().forEach(basketCandidateToBeDeleted -> {
            if (shouldRemoveBasket(basketCandidateToBeDeleted.getValue())) {
                sessionsToBeDeleted.add(basketCandidateToBeDeleted.getKey());
            } else {
                booksToBeUpdated.add(basketCandidateToBeDeleted.getKey());
            }
        } );
        deleteUnBookedSessions(sessionsToBeDeleted, from, sessionsToDeleteInCurrentPage.size());
        markBookedSessionAsProcessed(booksToBeUpdated, from);

        return !isTheLastPage(sessionsToDeleteInCurrentPage);
    }

    private void deleteUnBookedSessions(List<String> sessionsToBeDeleted, ZonedDateTime from, int totalBasketsToCheck) {
        try {
            if (!sessionsToBeDeleted.isEmpty()) {
                sessionService.deleteBasket(
                        sessionsToBeDeleted.toArray(new String[sessionsToBeDeleted.size()])
                );
            }

            LOG.info("Session Cleanup cron job finished for page. Total Baskets Processed: "
                    + totalBasketsToCheck + ". Baskets Deleted:" + sessionsToBeDeleted.size());
        } catch (Exception e) {
            LOG.error("Error removing unbooked sessions(" + sessionsToBeDeleted + ") for Date: " + Date.from(from.toInstant()), e);
        }
    }

    private void markBookedSessionAsProcessed(List<String> booksToBeUpdated, ZonedDateTime zonedDateTime) {
        try {
            if (!booksToBeUpdated.isEmpty()) {
                sessionService.markSessionAsProcessedByCron(
                        booksToBeUpdated.toArray(new String[booksToBeUpdated.size()])
                );
            }
        } catch (Exception e) {
            LOG.error("Error updating booked sessions (" + booksToBeUpdated + ") for Date:" + Date.from(zonedDateTime.toInstant()), e);
        }
    }

    private boolean isTheLastPage(Map<String, Basket> basketsToDeleteInCurrentPage) {
        return basketsToDeleteInCurrentPage.size() != DEFAULT_QUERY_PAGE_SIZE;
    }

    private boolean shouldRemoveBasket(Basket basket) {
        return !hasBookingReference(basket) && !isPaidBasket(basket);
    }

    private boolean hasBookingReference(Basket basket) {
        return !StringUtils.isEmpty(basket.getBookingRef()) || !StringUtils.isEmpty(basket.getBookingHoldRef());
    }

    private boolean isPaidBasket(Basket basket) {
        return basket.getSessionStack().stream().anyMatch(stack -> OperationTypeEnum.UPD_PAYMENT == stack.getOperation() || OperationTypeEnum.BOOK == stack.getOperation() );
    }

    public void setExpireDays(int expireDays) {
        this.expireDays = expireDays;
    }
}
