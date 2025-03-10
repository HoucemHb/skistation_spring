package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.fst.spring.skistation.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;


    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Color color;


    private int length;


    private int slope;

    @ManyToMany(mappedBy = "pistes")
    private List<Skier> skiers = new ArrayList<>();
}
