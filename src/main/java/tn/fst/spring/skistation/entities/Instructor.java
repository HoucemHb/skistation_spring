package tn.fst.spring.skistation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date dateOfHire;

   /* @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)*/
    @OneToMany
    @JoinTable(
            name = "instructor_courses",
            joinColumns = @JoinColumn(name = "numInstructor"),
            inverseJoinColumns = @JoinColumn(name = "numCourse")
    )
    private List<Course> courses;
}
