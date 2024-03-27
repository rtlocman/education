package ua.in.salo.pcnk.services;

import ua.in.salo.pcnk.model.Owner;
import ua.in.salo.pcnk.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
