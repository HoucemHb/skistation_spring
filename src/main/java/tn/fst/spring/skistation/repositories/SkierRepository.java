package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.spring.skistation.entities.Skier;

import java.util.List;

@Repository
public interface SkierRepository  extends JpaRepository<Skier, Long> {

    Skier findByLastName(String lastName);

    Skier findByFirstName(String firstName);

    List<Skier> findByCity(String city);
}
