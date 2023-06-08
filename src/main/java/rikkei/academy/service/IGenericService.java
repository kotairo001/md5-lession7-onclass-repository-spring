package rikkei.academy.service;

import rikkei.academy.model.Province;

import java.util.Optional;

public interface IGenericService <T>{
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void deleteById(Long id);
}
