package com.torr.service.impl;

import com.torr.domain.Foo;
import com.torr.repository.FooRepository;
import com.torr.service.FooService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class FooServiceImpl implements FooService {
    @Resource
    private FooRepository repository;
    @Override
    public Foo findOne(String id) {
        return repository.getOne(id);
    }

    @Override
    public Foo findByName(String name) {
        return repository.findByName(name);
    }
}
