package com.torr.repository;


import java.util.List;

public interface BaseDao<T> {
    T insert(T t);

    void delete(T t);

    T update(T t);

    List<T> findAll();

    T findOne(String pk);
}
