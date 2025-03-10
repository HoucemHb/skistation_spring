package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.fst.spring.skistation.entities.enums.Support;
import tn.fst.spring.skistation.entities.enums.TypeCourse;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;

    private int level;

    private TypeCourse typeCourse;

    private Support support;

    private float price;

    private int timeSlot;

  /*  @ManyToOne
    @JoinColumn(name = "numInstructor")
    private Instructor instructor;*/

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Registration> registrations;
}
