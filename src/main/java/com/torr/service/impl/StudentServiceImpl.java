package com.torr.service.impl;

import com.torr.domain.Student;
import com.torr.repository.StudentDao;
import com.torr.repository.impl.StudentDaoImpl;
import com.torr.service.StudentService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{



    @Resource
    private StudentDao studentDao;

    @Override
    public Student insert(Student student) {
        studentDao.insert(student);
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
        return studentDao.findAll();
    }
}
