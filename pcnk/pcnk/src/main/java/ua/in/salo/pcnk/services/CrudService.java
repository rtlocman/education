package ua.in.salo.pcnk.services;

import java.util.Set;

public interface CrudService <T, ID>{
    Set<T> findAll();
    T findById(ID id);
    T safe(T object);
    void delete(T object);
    void deleteById(ID id);
}
