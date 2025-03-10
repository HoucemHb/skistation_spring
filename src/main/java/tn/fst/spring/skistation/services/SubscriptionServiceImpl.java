package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.entities.Subscription;
import tn.fst.spring.skistation.entities.Subscription;
import tn.fst.spring.skistation.repositories.SubscriptionRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class SubscriptionServiceImpl implements  ISubscriptionService {
    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public List<Subscription> retrieveAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    @Override
    public Subscription addOrUpdateSubscription(Subscription subscription) {
        log.info("subscription"+ subscription.toString());
        log.debug("DS1..............");
        log.debug("DS2");
        return subscriptionRepository.save(subscription);
    }

    @Override
    public void removeSubscription(Subscription subscription) {
        subscriptionRepository.delete(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSubscription) {
        Optional<Subscription> subscriptionOptional = subscriptionRepository.findById(numSubscription);
        return subscriptionOptional.orElse(null);
    }
}
