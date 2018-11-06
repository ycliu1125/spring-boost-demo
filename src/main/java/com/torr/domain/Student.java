package com.torr.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
public class Student {
    @Id
    @Column(name = "studentId_")
    private String studentId;
    @Column(name = "name_")
    private String name;
}
