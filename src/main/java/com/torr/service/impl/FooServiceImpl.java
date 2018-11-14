package com.torr.service.impl;

import com.torr.domain.Foo;
import com.torr.repository.FooRepository;
import com.torr.service.FooService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<Foo> findAll() {
        return repository.findAll();
    }
}
