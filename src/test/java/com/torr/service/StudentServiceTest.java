package com.torr.service;

import com.torr.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {
    @Resource
    private StudentService studentService;

    @Test
   public void createTable(){
        //新增
        Student student=new Student();
        student.setStudentId("0007");
        student.setName("sungyeh");
        student=studentService.insert(student);
        assertThat(student).isNotNull();
        System.err.println(student);
        //查詢
        Student target=studentService.findOne("0007");
        assertThat(target).isNotNull();
        System.err.println(target);
        //修改
        target.setName("T226");
        Student ret=studentService.update(target);
        assertThat(ret).isNotNull();
        System.err.println(ret);
        //刪除
        studentService.delete(ret);
        ret=studentService.findOne("0007");
        assertThat(ret).isNull();
        //find all
        assertThat(studentService.findAll()).hasSize(5);
    }
}
