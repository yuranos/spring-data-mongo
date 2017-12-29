package com.yuranos.session;

import com.yuranos.session.model.Basket;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SessionService {

//    void createBasket(String id, Basket basket) throws SessionException;

//    void updateBasket(String id, Basket basket) throws SessionException;

    void deleteBasket(String... id) throws SessionException;
    
//    Basket getBasket(String id) throws SessionException;
    
//    List<Basket> getBaskets(List<String> ids) throws SessionException;

    /**
     * Return associated map with <tt>Session</tt> id and associated outdated <tt>Basket</tt> with this com.yuranos.session. Outdated <tt>Basket</tt> means basket is older than  <tt>timeThreshold</tt>
     * @param timeThreshold
     * @param pageSize
     * @return
     * @throws SessionException
     */
    Map<String, Basket> findEligibleBasketsToBeDeletedOff(Date timeThreshold, int pageSize) throws SessionException;

    void markSessionAsProcessedByCron(String... session) throws SessionException;

//    void saveSession(Basket basket);
//
//    Basket getLockedBasket(String id) throws SessionException;
//
//    void lockCommittedBasket(String id) throws SessionException;
//
//    void unlockSession(String id) throws SessionException;
}
