package com.torr.domain;

import lombok.Data;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class KonoSuba {
    @Id
    @Column(name = "card_id_")
    private String cardId;
    @Column(name = "name_")
    private String name;
    @Column(name = "hp_")
    private Integer hp;
    @Column(name = "atk_")
    private Integer atk;
    @Column(name = "rec_")
    private Integer rec;
    @Column(name = "sex_")
    private Boolean sex;
    @Column(name = "race_")
    private String race;

    @Override
    public String toString(){
        String detail = "Card detail: "+this.getCardId()+","+
                this.getName()+","+
                this.getHp()+","+
                this.getAtk()+","+
                this.getRec()+","+
                this.getSex()+","+
                this.getRace();
        return detail;
    }

}
