package com.torr.service;

import java.util.List;

public interface BaseService1<T> {
    T insert(T t);

    void delete(T t);

    T update(T t);

    List<T> findAll();

    T findOne(String pk);

    T findOneByName (String name);
}
