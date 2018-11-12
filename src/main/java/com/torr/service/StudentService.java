package com.torr.service;

import com.torr.domain.Student;

import java.util.List;

public interface StudentService {
    Student insert(Student student);

    void delete(Student student);

    Student update(Student student);

    List<Student> findAll();

    Student findOne(String studentId);

}
