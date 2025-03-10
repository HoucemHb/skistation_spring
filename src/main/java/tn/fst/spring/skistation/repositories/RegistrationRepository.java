package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.spring.skistation.entities.Registration;

import java.util.List;

@Repository
public interface RegistrationRepository  extends JpaRepository<Registration, Long> {
    
    List<Registration> findByNumWeek(int numWeek);
}
