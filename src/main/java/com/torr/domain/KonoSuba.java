package com.torr.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


/**
 * 美好世界合作系列卡片
 */
@Entity
@Data
@Table(name = "konosuba")
public class KonoSuba {
    /**
     * 卡片編號
     */
    @Id
    @Column(name = "card_id_")
    private String cardId;

    /**
     * 卡片名稱
     */
    @Column(name = "name_")
    private String name;

    /**
     * 卡片角色血量
     */
    @Column(name = "hp_")
    private Integer hp;

    /**
     * 卡片角色攻擊力
     */
    @Column(name = "atk_")
    private Integer atk;

    /**
     * 卡片角色種族
     */
    @Column(name = "rec_")
    private Integer rec;

    /**
     * 卡片角色性別
     */
    @Column(name = "sex_")
    private Boolean sex;

    /**
     * 卡片角色種族
     */
    @Column(name = "race_")
    private String race;

    /**
     * 與卡片技能建立關聯
     */
    @ManyToOne
    @JoinColumn(name = "skill_id_")
    private KonoSubaSkill skill;

    /**
     * 建立外部表格來達到 ManyToMany 的參考
     */
    @ManyToMany //ManyToMany的時機:當欄位的值可能有不只一個的時候
    @JoinTable(
            name = "card_skill_",
            joinColumns = {@JoinColumn(name = "card_id_")},
            inverseJoinColumns = {@JoinColumn(name = "skill_id")},
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"card_id_", "skill_id"}))
    private List<KonoSubaSkill> skills;

    /**
     * 自我關聯到父項目
     */
    @ManyToOne
    @JoinColumn(name = "parent_")
    private KonoSuba parent;

    /**
     * 反向關聯子項目
     */
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent")
    private List<KonoSuba> konoSubas;

    @Column(name = "head_picture_")
    private String headPicLink;
}
