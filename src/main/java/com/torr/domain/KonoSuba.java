package com.torr.domain;

import lombok.Data;

@Data
public class KonoSuba {

    private String cardId;
    private String name;
    private int hp;
    private int atk;
    private int rec;
    private boolean sex;
    private String race;

    @Override
    public String toString(){
        KonoSuba konoSuba = new KonoSuba();
        String detail = konoSuba.getCardId()+
                konoSuba.getName()+
                konoSuba.getHp()+
                konoSuba.getAtk()+
                konoSuba.getRec()+
                konoSuba.isSex()+
                konoSuba.getRace();
        return detail;

    }


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getRec() {
        return rec;
    }

    public void setRec(int rec) {
        this.rec = rec;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
