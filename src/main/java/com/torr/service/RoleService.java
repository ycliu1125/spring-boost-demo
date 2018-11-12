package com.torr.service;

import com.torr.domain.Role;

import java.util.List;

public interface RoleService {

    Role insert(Role role);

    void delete(Role role);

    Role update(Role role);

    List<Role> findAll();

    Role findOne(String roleId);
}
