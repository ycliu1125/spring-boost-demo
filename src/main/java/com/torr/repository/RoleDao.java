package com.torr.repository;

import com.torr.domain.Role;


public interface RoleDao extends BaseDao<Role>{
    Role findOneByCareer(String career);
}
