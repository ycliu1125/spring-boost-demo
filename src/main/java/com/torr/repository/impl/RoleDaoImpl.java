package com.torr.repository.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.torr.domain.Role;
import com.torr.repository.RoleDao;
import com.torr.domain.Role;
import com.torr.repository.RoleDao;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Role insert(Role role) {
        return jdbcTemplate.update("INSERT INTO ROLES(NAME_,ATK_,HP_,CAREER_) VALUES(?,?,?,?)", role.getName(), role.getAttackDamage(),role.getHealthPoints(),role.getCareer()) > 0
                ? findOne(role.getId()) : null;
    }

    @Override
    public void delete(Role role) {
        jdbcTemplate.update("DELETE FROM ROLES WHERE NAME_=?", role.getName());
    }

    @Override
    public Role update(Role role) {
        return jdbcTemplate.update("UPDATE ROLES " +
                "SET CAREER_=? " +
                "WHERE NAME_=? ", role.getCareer(),role.getName()) > 0
                ? findOne(role.getId()) : null;

    }



    @Override
    public List<Role> findAll() {
        List<Role> list = jdbcTemplate.query("SELECT * FROM ROLES ", new RolesMapper());
        return list.size() == 0 ? null : list;
    }

    @Override
    public Role findOne(String ID) {
        Role role;
        try {
            role = (Role) jdbcTemplate.queryForObject("SELECT * FROM ROLES WHERE ID_=?",
                    new Object[]{ID}, new RolesMapper());
        } catch (EmptyResultDataAccessException e) {
            role = null;
        }
        return role;
    }
    public Role findOneByCareer(String Career) {
        Role role;
        try {
            role = (Role) jdbcTemplate.queryForObject("SELECT * FROM ROLES WHERE CAREER_=?",
                    new Object[]{Career}, new RolesMapper());
        } catch (EmptyResultDataAccessException e) {
            role = null;
        }
        return role;
    }



    public class RolesMapper implements RowMapper{
        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            Role role = new Role();
            role.setId(resultSet.getString("ID_"));
            role.setName(resultSet.getString("NAME_"));
            role.setAttackDamage(resultSet.getInt("ATK_"));
            role.setHealthPoints(resultSet.getInt("HP_"));
            role.setCareer(resultSet.getString("CAREER_"));

            return role;
        }
    }
}

