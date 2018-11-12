package com.torr.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class KonoSuba {
    @Id
    @Column(name = "card_id_")
    private String cardId;
    @Column(name = "name_")
    private String name;
    @Column(name = "hp_")
    private int hp;
    @Column(name = "atk_")
    private int atk;
    @Column(name = "rec_")
    private int rec;
    @Column(name = "sex_")
    private boolean sex;
    @Column(name = "race_")
    private String race;

    @Override
    public String toString(){
        String detail = "Card detail: "+this.getCardId()+","+
                this.getName()+","+
                this.getHp()+","+
                this.getAtk()+","+
                this.getRec()+","+
                this.isSex()+","+
                this.getRace();
        return detail;
    }

}
