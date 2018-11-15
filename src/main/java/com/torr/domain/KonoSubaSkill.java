package com.torr.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    /**
     * 誰擁有這項技能
     * 建立外部表格來達到 ManyToMany 的參考
     */
    @JsonIgnore
    @ManyToMany //ManyToMany的時機:當欄位的值可能有不只一個的時候
    @JoinTable(
            name = "skill_card_",
            joinColumns = {@JoinColumn(name = "skill_id_")},
            inverseJoinColumns = {@JoinColumn(name = "card_id")},
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"skill_id_", "card_id"}))
    private List<KonoSuba> cards;
}
