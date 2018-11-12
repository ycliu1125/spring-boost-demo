package com.torr.service.impl;

import com.torr.domain.KonoSuba;
import com.torr.repository.impl.KonoSubaDaoImpl;
import com.torr.service.KonoSubaService;

import java.util.List;

public class KonoSubaServiceImpl implements KonoSubaService {

    private KonoSubaDaoImpl konoSubaDaoImpl;

    @Override
    public KonoSuba insert(KonoSuba konoSuba) {
        if (checkData(konoSuba))
            return konoSubaDaoImpl.insert(konoSuba);
        else{
            System.out.println("Data is wrong!!");
            return null;
        }
    }

    @Override
    public void delete(KonoSuba konoSuba) {
        konoSubaDaoImpl.delete(konoSuba);
    }

    @Override
    public KonoSuba update(KonoSuba konoSuba) {
        if (checkData(konoSuba))
            return konoSubaDaoImpl.update(konoSuba);
        else {
            System.out.println("Data is wrong!!");
            return null;
        }
    }

    @Override
    public List<KonoSuba> findAll() {
        return konoSubaDaoImpl.findAll();
    }

    @Override
    public KonoSuba findOne(String cardId) {
        return konoSubaDaoImpl.findOne(cardId);
    }

    @Override
    public KonoSuba findOneByName(String name){
        return konoSubaDaoImpl.findOneByName(name);
    }

    private Boolean checkData(KonoSuba konoSuba){
        return true;
    }
}
