package tn.fst.spring.skistation.services;

import tn.fst.spring.skistation.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    List<Subscription> retrieveAllSubscriptions();
    Subscription addOrUpdateSubscription(Subscription piste);
    void removeSubscription (Subscription piste);
    Subscription retrieveSubscription (Long numSubscription);
}
