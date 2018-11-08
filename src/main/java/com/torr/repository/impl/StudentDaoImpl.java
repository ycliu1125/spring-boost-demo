package com.torr.repository.impl;

import com.torr.domain.Student;
import com.torr.repository.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public Student insert(Student student) {
        return null;
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        List<Map<String, Object>> list =jdbcTemplate.queryForList("SELECT * FROM STUDENTS ");
        List<Student> students=new ArrayList<>();
        list.forEach(map->{
            Student student =new Student();
            student.setStudentId((String) map.get("studentid_"));
            student.setStudentId((String) map.get("name_"));
            students.add(student);
        });

        return  students.size()==0?null:students;
    }

    @Override
    public Student findOne(String studentId) {
        return null;
    }
}
