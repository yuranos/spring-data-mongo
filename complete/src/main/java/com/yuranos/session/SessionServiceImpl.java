package com.yuranos.session;


import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yuranos.session.model.Basket;
import com.yuranos.session.model.CardPaymentDetails;
import com.yuranos.session.model.Market;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SessionServiceImpl implements SessionService {

    private static final String BAPI_CRON_USER = "bapi-cron";
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private static final String BASKET_ID = "_id";

    private final MongoOperations repository;
    private final ObjectMapper objectMapper;

    @Autowired
    public SessionServiceImpl(
            MongoOperations repository,
            ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

//    @Override
//    public void saveSession(Basket basket) {
//        try {
//            this.updateBasket(basket.getBasketId(), basket);
//        } catch (SessionException e) {
//            LOG.error("Error create session Basket found for BookingReference: {0} ", basket.getBookingRef(), e);
//        }
//    }

//    @Override
//    public void createBasket(String id, Basket basket) throws SessionException {
//
//        addToRepository(id, basket);
//        if (LOG.isDebugEnabled()) {
//            LOG.debug("New session {} created", id);
//        }
//    }
//
//    @Override
//    public void updateBasket(String id, Basket basket) throws SessionException {
//        //TODO: Remove this log after payID bug is fixed
//        logOgonePayId(id, basket);
//        addToRepository(id, basket);
//        if (LOG.isDebugEnabled()) {
//            LOG.debug("Session {} updated", id);
//        }
//    }

    private void logOgonePayId(String id, Basket basket) {
        CardPaymentDetails paymentDetails = basket.getPaymentDetails();
        if (basket != null &&
                basket.getMarket() != null &&
                (basket.getMarket().equals(Market.BE) || basket.getMarket().equals(Market.NL)) &&
                paymentDetails != null &&
                paymentDetails.getPayId() != null) {
            LOG.info("Updating payId: " + paymentDetails.getPayId() + " for basket " + id);
        }
    }

    @Override
    public void deleteBasket(String... ids) throws SessionException {
        Criteria criteria = Criteria.where("_id").in(ids);
        repository.remove(Query.query(criteria), Session.class);
    }

//    @Override
//    public Basket getBasket(String id) throws SessionException {
//
//        Session session = repository.findById(id, Session.class);
//        //This trace allows us to see how the basket evolves along the checkout journey
//        if (LOG.isDebugEnabled()) {
//            LOG.debug("GET SESSION:{}", session.getBasket());
//        }
//
//        if (session == null) {
//            throw new SessionException();
//        } else {
//            Basket ret = unMarshallBasket(session.getBasket());
//            ret.getError().clear();
//            return ret;
//        }
//    }

//    @Override
//    public Basket getLockedBasket(String id) throws SessionException {
//        String whereStr = "_basket.paymentTransactionLock";
//        Criteria existsCriteria = Criteria.where(whereStr).exists(Boolean.FALSE);
//        Criteria nullCriteria = Criteria.where(whereStr).is(null);
//
//        Criteria criteria = Criteria.where("_id").is(id).orOperator(existsCriteria, nullCriteria);
//        // Lock Document in Session collection in Mongo DB
//        Session lockedSession = repository.findAndModify(new Query(criteria),
//                Update.update(whereStr, PaymentTransactionStatus.TRANSACTION_STARTED),
//                FindAndModifyOptions.options().returnNew(Boolean.TRUE),
//                Session.class);
//
//        return lockedSession != null ? unMarshallBasket(lockedSession.getBasket()) : null;
//    }
//
//    @Override
//    public void unlockSession(String id) {
//        repository.updateFirst(Query.query(Criteria.where("_id").is(id)), new Update().unset("_basket.paymentTransactionLock"), Session.class);
//    }
//
//    @Override
//    public void lockCommittedBasket(String id) {
//        repository.updateFirst(Query.query(Criteria.where("_id").is(id)), Update.update("_basket.paymentTransactionLock", PaymentTransactionStatus.TRANSACTION_COMPLETED), Session.class);
//    }

//    @Override
//    public List<Basket> getBaskets(List<String> ids) throws SessionException {
//        ArrayList<Basket> baskets = new ArrayList<>();
//        Criteria criteria = new Criteria().where(BASKET_ID).in(ids);
//        Query query = Query.query(criteria);
//        List<Session> sessions = repository.find(query, Session.class);
//        for (Session session : sessions) {
//            baskets.add(unMarshallBasket(session.getBasket()));
//        }
//
//        return baskets;
//    }

//    private Basket upgradeBasketIfNotCompatible(Session session) throws SessionException {
//        Basket updatedBasket = null;
//        Optional<FeatureBean> basketTransformerFeature = featureService.loadSingleFeature(BapiFeature.BASKET_TRANSFORMER);
//        if (basketTrasformationRequired(basketTransformerFeature, session)) {
//            Optional<VersionEnum> oldVersionOptional = VersionEnum.findVersionEnum(session.getBasketVersion());
//            if (oldVersionOptional.isPresent()) {
//                String upgradedBasketString = jsonConversionService.convertBasketJson(session.getBasket(), oldVersionOptional.get());
//                updatedBasket = unMarshallBasket(upgradedBasketString);
//                updateBasket(updatedBasket.getBasketId(), updatedBasket);
//            }
//        }
//
//        if (updatedBasket == null) {
//            updatedBasket = unMarshallBasket(session.getBasket());
//        }
//
//        return updatedBasket;
//    }

//    private boolean basketTrasformationRequired(Optional<FeatureBean> basketTransformerFeature, Session session) {
//        return basketTransformerFeature.isPresent()
//                && basketTransformerFeature.get().isEnabled()
//                && !equalsIgnoreCase(BasketUtil.CURRENT_BASKET.getVersion(), session.getBasketVersion());
//    }
    public Basket unMarshallBasket(final String basket) throws SessionException {

        try {
            return objectMapper.readValue(basket, Basket.class);
        } catch (IOException e) {
            LOG.error("Exception while unmarshalling basket.", e);
            throw new SessionException();
        }
    }

    private String marshalBasket(final Basket basket) throws SessionException {

        try {
            return objectMapper.writeValueAsString(basket);
        } catch (IOException e) {
            LOG.error("Exception while marshalling basket..BaskedId:" + basket.getBasketId(), e);
            throw new SessionException();
        }
    }

//    protected void addToRepository(String id, Basket basket) throws SessionException {
//        String json = marshalBasket(basket);
//        Session session = new Session(id, json, basket.getVersion());
//        repository.save(session);
//
//        if (id == null) {
//            logNullBasketId(basket);
//        }
//    }

    private void logNullBasketId(Basket basket) {
        try {
            String basketString = basket.toString();
            String stackTrace = Arrays.toString(Thread.currentThread().getStackTrace());
            LOG.error("NULL basketId stored to the MongoDB. Basket: {}; StackTrace: {}", basketString, stackTrace);
        } catch (Exception e) {
            LOG.error("Can't log 'NULL basketId stored' case.", e);
        }
    }

    @Override
    public Map<String, Basket> findEligibleBasketsToBeDeletedOff(Date timeThreshold, int pageSize) throws SessionException {
        Query query = Query.query(Criteria.where("date").lt(timeThreshold).and("updatedBy").is(null));
        query.limit(pageSize);
        List<Session> sessions = repository.find(query, Session.class);
        Map<String, Basket> baskets = new HashMap<>(sessions.size());
        for (Session session : sessions) {
            baskets.put(session.getId(), unMarshallBasket(session.getBasket()));
        }
        return baskets;
    }

    @Override
    public void markSessionAsProcessedByCron(String... sessionId) {
        repository.updateMulti(
                Query.query(Criteria.where("_id").in(sessionId)),
                Update.update("updatedBy", BAPI_CRON_USER),
                Session.class
        );
    }

}
