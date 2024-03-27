package ua.in.salo.pcnk.services;

import ua.in.salo.pcnk.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
