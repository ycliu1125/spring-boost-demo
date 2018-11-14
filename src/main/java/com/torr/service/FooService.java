package com.torr.service;

import com.torr.domain.Foo;

import java.util.List;

public interface FooService {

    Foo findOne(String id);

    Foo findByName(String name);

    List<Foo> findAll();

}
