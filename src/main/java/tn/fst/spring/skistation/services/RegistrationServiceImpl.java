package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.entities.Registration;
import tn.fst.spring.skistation.entities.Registration;
import tn.fst.spring.skistation.repositories.RegistrationRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class RegistrationServiceImpl implements  IRegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public List<Registration> retrieveAllRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration addOrUpdateRegistration(Registration registration) {
        log.info("registration"+ registration.toString());
        log.debug("DS1..............");
        log.debug("DS2");
        return registrationRepository.save(registration);
    }

    @Override
    public void removeRegistration(Registration registration) {
        registrationRepository.delete(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        Optional<Registration> registrationOptional = registrationRepository.findById(numRegistration);
        return registrationOptional.orElse(null);
    }
}
