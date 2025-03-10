package tn.fst.spring.skistation.services;

import tn.fst.spring.skistation.entities.Skier;

import java.util.List;

public interface ISkierService {
    List<Skier> retrieveAllSkiers();
    Skier addOrUpdateSkier(Skier skier);
    void removeSkier (Skier skier);
    Skier retrieveSkier (Long numSkier);
}
