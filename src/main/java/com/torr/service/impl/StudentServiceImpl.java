package com.torr.service.impl;

import com.torr.domain.Student;
import com.torr.repository.BaseDao;
import com.torr.repository.StudentDao;
import com.torr.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student insert(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public void delete(Student student) {
        studentDao.delete(student);
    }

    @Override
    public Student update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findOne(String studentId) {
        return studentDao.findOne(studentId);
    }
}
