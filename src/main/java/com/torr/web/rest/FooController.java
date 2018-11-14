package com.torr.web.rest;

import com.torr.domain.Foo;
import com.torr.service.FooService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class FooController {
    @Resource
    private FooService fooService;

    @GetMapping("foo")
    public List<Foo> findAll() {
        return fooService.findAll();
    }
}
