package com.torr.service;


import com.torr.domain.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {
    @Resource
    private RoleService roleService;

    @Test
    public void roleTest(){
        //新增
        Role role=new Role();
        role.setId("10");
        role.setName("Arthur");
        role.setAttackDamage(99999);
        role.setHealthPoints(9999999);
        role.setCareer("emperor");
        role = roleService.insert(role);
        assertThat(role).isNotNull();
        System.err.println(role);



        //查詢
        Role query=roleService.findOne("10");
        assertThat(query).isNotNull();
        System.err.println(query);

        //修改
        query.setName("無名氏");
        Role ret=roleService.update(query);
        assertThat(ret).isNotNull();
        System.err.println(ret);

        //刪除
        roleService.delete(ret);
        ret=roleService.findOne("10");
        assertThat(ret).isNull();

        //find all
        assertThat(roleService.findAll()).hasSize(9);


    }
}
