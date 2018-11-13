package com.torr.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Bar {
    @Id
    @Column(name = "id_")
    private String id;
    @Column(name = "col_")
    private String col;
}
