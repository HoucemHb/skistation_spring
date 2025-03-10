package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.entities.Instructor;
import tn.fst.spring.skistation.entities.Instructor;
import tn.fst.spring.skistation.repositories.InstructorRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class InstructorServiceImpl implements  IInstructorService {
    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public List<Instructor> retrieveAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor addOrUpdateInstructor(Instructor instructor) {
        log.info("instructor"+ instructor.toString());
        log.debug("DS1..............");
        log.debug("DS2");
        return instructorRepository.save(instructor);
    }

    @Override
    public void removeInstructor(Instructor instructor) {
        instructorRepository.delete(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        Optional<Instructor> instructorOptional = instructorRepository.findById(numInstructor);
        return instructorOptional.orElse(null);
    }
}
