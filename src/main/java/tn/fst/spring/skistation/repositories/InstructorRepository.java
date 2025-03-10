package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.spring.skistation.entities.Instructor;

import java.util.Date;
import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
List<Instructor> findByDateOfHire(Date dateOfHire);
}
