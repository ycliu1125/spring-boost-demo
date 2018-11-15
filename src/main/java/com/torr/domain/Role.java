package com.torr.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "role")
@Entity
@Data
public class Role {

    @Id
    @Column(name = "id_")
    private String id;

    @Column(name = "name_")
    private String name;

    @Column(name = "hp_")
    private int healthPoints;

    @Column(name = "atk_")
    private int attackDamage;

    @Column(name = "career_")
    private String career;
}
