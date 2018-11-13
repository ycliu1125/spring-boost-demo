package com.torr.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"parent"})
public class Foo {
    @Id
    @Column(name = "id_")
    private String id;

    @Column(name = "name_")
    private String name;

    @Column(name = "no_")
    private Integer no;
    /**
     * many to one
     * 建立關聯
     */
    @ManyToOne
    @JoinColumn(name = "bar_id_")
    private Bar bar;
    /**
     * many to many
     * 建立外部表供reference
     */
    @ManyToMany
    @JoinTable(
            name = "foo_bar",
            joinColumns = {@JoinColumn(name = "foo_id_")},
            inverseJoinColumns = {@JoinColumn(name = "bar_id_")},
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"foo_id_", "bar_id_"}))
    private List<Bar> bars;
    /**
     * 關聯父項目
     */
    @ManyToOne
    @JoinColumn(name = "parent_")
    private Foo parent;
    /**
     * 反向關聯子項目
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent")
    private List<Foo> foos;


}
