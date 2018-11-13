package com.torr.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 卡片技能
 */
@Entity
@Data
@Table(name = "konosubaskill")
public class KonoSubaSkill {

    /**
     * 技能編號
     */
    @Id
    @Column(name = "id_")
    private String id;

    /**
     * 技能名稱
     */
    @Column(name = "name_")
    private String name;

}
