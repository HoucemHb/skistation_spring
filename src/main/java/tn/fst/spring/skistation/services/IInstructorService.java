package tn.fst.spring.skistation.services;

import tn.fst.spring.skistation.entities.Instructor;

import java.util.List;

public interface IInstructorService {
    List<Instructor> retrieveAllInstructors();
    Instructor addOrUpdateInstructor(Instructor piste);
    void removeInstructor (Instructor piste);
    Instructor retrieveInstructor (Long numInstructor);
}
