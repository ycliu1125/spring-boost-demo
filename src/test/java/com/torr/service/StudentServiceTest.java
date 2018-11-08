package com.torr.service;

import com.torr.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {
    @Resource
    private StudentService studentService;

    @Test
   public void createTable(){
        //新增
        Student student=new Student();
        System.err.println(studentService.insert(student));
        //查詢
//        Student queryStudent=studentService.findOne("0001");
//        System.err.println(queryStudent);
        //修改
//        System.err.println(studentService.update(queryStudent));
        //刪除
        studentService.delete(student);
        //        Student queryStudent=studentService.findOne("0001");
//        System.out.println(Objects.isNull(queryStudent));
    }
}
