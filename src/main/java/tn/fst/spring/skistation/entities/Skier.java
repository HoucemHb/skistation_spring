package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.fst.spring.skistation.entities.enums.Color;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;


    private String firstName;


    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String city;

    @OneToMany(mappedBy = "skier", cascade = CascadeType.ALL)
    private List<Registration> registrations;

    @OneToOne
    @JoinColumn(name = "numSub")
    private Subscription subscription;

    @ManyToMany
    @JoinTable(
            name = "skier_piste",
            joinColumns = @JoinColumn(name = "skier_id"),
            inverseJoinColumns = @JoinColumn(name = "piste_id")
    )
    private List<Piste> pistes = new ArrayList<>();
}