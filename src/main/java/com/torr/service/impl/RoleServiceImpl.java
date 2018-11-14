package com.torr.service.impl;

import com.torr.domain.Role;
import com.torr.repository.RoleDao;
import com.torr.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;

    @Override
    public Role insert(Role role) {
        return roleDao.insert(role);
    }

    @Override
    public void delete(Role role) {
        roleDao.delete(role);
    }

    @Override
    public Role update(Role role) {
        return roleDao.update(role);
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }


    @Override
    public Role findOne(String Id) {
        return roleDao.findOne(Id);
    }

    @Override
    public Role findOneByCareer(String career) {
        return roleDao.findOneByCareer(career);
    }
}
