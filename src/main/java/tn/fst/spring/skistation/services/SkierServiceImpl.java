package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.entities.Skier;
import tn.fst.spring.skistation.entities.Skier;
import tn.fst.spring.skistation.repositories.SkierRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class SkierServiceImpl implements  ISkierService{
    @Autowired
    private SkierRepository skierRepository;

    @Override
    public List<Skier> retrieveAllSkiers() {
        return skierRepository.findAll();
    }

    @Override
    public Skier addOrUpdateSkier(Skier skier) {
        log.info("skier"+ skier.toString());
        log.debug("DS1..............");
        log.debug("DS2");
        return skierRepository.save(skier);
    }

    @Override
    public void removeSkier(Skier skier) {
        skierRepository.delete(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        Optional<Skier> skierOptional = skierRepository.findById(numSkier);
        return skierOptional.orElse(null);
    }
}
