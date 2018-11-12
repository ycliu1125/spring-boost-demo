package com.torr.service;

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
    @Test
    public void test(){
        System.out.println(fooService.findByName("Anna"));
    }
}
