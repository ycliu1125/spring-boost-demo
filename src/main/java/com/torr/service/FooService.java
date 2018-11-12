package com.torr.service;

import com.torr.domain.Foo;

public interface FooService {

    Foo findOne(String id);
    Foo findByName(String name);

}
