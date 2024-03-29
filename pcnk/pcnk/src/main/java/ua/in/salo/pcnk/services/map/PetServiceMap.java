package ua.in.salo.pcnk.services.map;

import ua.in.salo.pcnk.model.Pet;
import ua.in.salo.pcnk.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public Pet findById(Long id) {
        return null;
    }

    @Override
    public Pet safe(Pet object) {
        return null;
    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
