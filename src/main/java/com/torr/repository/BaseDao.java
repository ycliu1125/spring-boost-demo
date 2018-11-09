package com.torr.repository;

import com.torr.domain.Student;

import java.util.List;

public interface BaseDao {
    Student insert(Student student);
    void delete(Student student);
    Student update(Student student);
    List<Student> findAll();
    Student findOne(String studentId);
}
