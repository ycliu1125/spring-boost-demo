package com.torr.repository.impl;

import com.torr.domain.Role;
import com.torr.repository.RoleDao;
import com.torr.domain.Role;
import com.torr.repository.RoleDao;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RoleDaoImpl implements RoleDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Role insert(Role role) {
        return jdbcTemplate.update("INSERT INTO ROLES(NAME_,ATK_,HP_,CAREER_) VALUES(?,?)", role.getName(), role.getAttackDamage(),role.getHealthPoints(),role.getCareer_()) > 0
                ? findOne(role.getId()) : null;
    }

    @Override
    public void delete(Role role) {
        jdbcTemplate.update("DELETE FROM ROLES WHERE ID_=?", role.getId());
    }

    @Override
    public Role update(Role role) {
        return null;
    }



    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Role findOne(String pk) {
        return null;
    }
}
