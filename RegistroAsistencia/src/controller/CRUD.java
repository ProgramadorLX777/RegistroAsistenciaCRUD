package controller;

import java.util.List;
import java.util.Optional;

// Creación de CRUD para creación de usuarios:
public interface CRUD <E> {
    void insert(E obj);
    void delete(E obj);
    Optional<E> get(int id);
    void update(E obj);
    Optional<List<E>> getAll();
}
