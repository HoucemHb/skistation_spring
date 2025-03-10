package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.spring.skistation.entities.Subscription;
import tn.fst.spring.skistation.entities.enums.TypeSubscription;

import java.util.Date;
import java.util.List;

@Repository
public interface SubscriptionRepository  extends JpaRepository<Subscription, Long> {

    List<Subscription> findByTypeSub(TypeSubscription typeSub);

    List<Subscription> findByStartDate(Date startDate);

    List<Subscription> findByEndDate(Date endDate);
}
