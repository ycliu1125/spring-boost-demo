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
