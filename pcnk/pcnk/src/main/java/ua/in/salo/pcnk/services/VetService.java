package ua.in.salo.pcnk.services;

import ua.in.salo.pcnk.model.Owner;
import ua.in.salo.pcnk.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
