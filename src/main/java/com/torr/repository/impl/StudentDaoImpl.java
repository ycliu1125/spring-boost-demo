package com.torr.repository.impl;

import com.torr.domain.Student;
import com.torr.repository.StudentDao;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Student insert(Student student) {
        return jdbcTemplate.update("INSERT INTO STUDENTS(STUDENTID_,NAME_) VALUES(?,?)", student.getStudentId(), student.getName()) > 0
                ? findOne(student.getStudentId()) : null;
    }

    @Override
    public void delete(Student student) {
        jdbcTemplate.update("DELETE FROM STUDENTS WHERE STUDENTID_=?", student.getStudentId());
    }

    @Override
    public Student update(Student student) {
        return jdbcTemplate.update(" UPDATE STUDENTS " +
                "SET NAME_=?" +
                "WHERE STUDENTID_=?", student.getName(), student.getStudentId()) > 0
                ? findOne(student.getStudentId()) : null;
    }

    @Override
    public List<Student> findAll() {
        List<Student> list = jdbcTemplate.query("SELECT * FROM STUDENTS ", new StudentMapper());
        return list.size() == 0 ? null : list;
    }

    @Override
    public Student findOne(String studentId) {
        Student student;
        try {
            student = (Student) jdbcTemplate.queryForObject("SELECT * FROM STUDENTS WHERE STUDENTID_=?",
                    new Object[]{studentId}, new StudentMapper());
        } catch (EmptyResultDataAccessException e) {
            student = null;
        }
        return student;
    }

    class StudentMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            Student student = new Student();
            student.setName(resultSet.getString("NAME_"));
            student.setStudentId(resultSet.getString("STUDENTID_"));

            return student;
        }
    }
}
