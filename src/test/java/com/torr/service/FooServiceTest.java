package com.torr.service;

import com.torr.domain.Foo;
import com.torr.repository.BarRepository;
import com.torr.repository.FooRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class FooServiceTest {
    @Resource
    private FooService fooService;
    @Resource
    private FooRepository repository;
    @Resource
    private BarRepository barRepository;

    @Test
    public void test() {
        Foo foo = repository.findByName("Anna");
        System.out.println(foo.getFoos().get(0).getId());
        foo.getFoos().forEach(foo1 -> System.err.println(foo1.getName() + " " + foo1.getParent().getName()));
        foo.getBars().forEach(System.err::println);

    }
}
