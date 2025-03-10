package tn.fst.spring.skistation.services;

import tn.fst.spring.skistation.entities.Piste;
import tn.fst.spring.skistation.entities.Registration;

import java.util.List;

public interface IRegistrationService {
    List<Registration> retrieveAllRegistrations();
    Registration addOrUpdateRegistration(Registration registration);
    void removeRegistration (Registration registration);
    Registration retrieveRegistration (Long numRegistration);
}
