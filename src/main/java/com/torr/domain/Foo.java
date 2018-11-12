package com.torr.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Foo {
    @Id
    private String id;
    @Column(name="name_")
    private String name;
    @Column(name="no_")
    private  Integer no;

}
