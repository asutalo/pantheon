package com.eu.at_it.service;

import java.util.List;

public interface DataService<T, Q> {
    T update(T toUpdate) throws Exception;

    T save(T toSave) throws Exception;

    void delete(T toDelete) throws Exception;

    Q filteredSelect();

    T get(Q filteredSelect) throws Exception;

    List<T> getAll() throws Exception;

    List<T> getAll(Q filteredSelect) throws Exception;
}
