package ua.in.salo.pcnk.services.map;

import ua.in.salo.pcnk.model.Owner;
import ua.in.salo.pcnk.services.CrudService;
import ua.in.salo.pcnk.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner safe(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
