package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.fst.spring.skistation.entities.enums.Color;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRegistration;


    private int numWeek;

    @ManyToOne
    @JoinColumn(name = "numSkier")
    private Skier skier;

    @ManyToOne
    @JoinColumn(name = "numCourse")
    private Course course;

}

