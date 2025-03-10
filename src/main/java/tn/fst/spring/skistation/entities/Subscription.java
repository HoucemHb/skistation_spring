package tn.fst.spring.skistation.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.fst.spring.skistation.entities.enums.Color;
import tn.fst.spring.skistation.entities.enums.TypeSubscription;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private float price;

    private TypeSubscription typeSub;

   /* @OneToOne(mappedBy = "subscription", cascade = CascadeType.ALL)
    private Skier skier;*/

}
