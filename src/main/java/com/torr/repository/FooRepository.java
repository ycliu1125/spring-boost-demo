package com.torr.repository;

import com.torr.domain.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo,String > {
    Foo findByName(String name);
}
