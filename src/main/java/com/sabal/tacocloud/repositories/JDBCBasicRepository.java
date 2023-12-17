package com.sabal.tacocloud.repositories;

import java.util.Optional;

public interface JDBCBasicRepository<T> {

    Iterable<T> findAll();

    Optional<T> findById(String id);

    T save(T entity);
}
