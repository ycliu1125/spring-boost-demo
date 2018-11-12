package com.torr.service.impl;

import com.torr.domain.KonoSuba;
import com.torr.repository.KonoSubaDao;
import com.torr.repository.impl.KonoSubaDaoImpl;
import com.torr.service.KonoSubaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class KonoSubaServiceImpl implements KonoSubaService {
    
    @Resource
    private KonoSubaDao konoSubaDao;

    @Override
    public KonoSuba insert(KonoSuba konoSuba) {
        if (checkData(konoSuba))
            return konoSubaDao.insert(konoSuba);
        else{
            System.out.println("Data is wrong!!");
            return null;
        }
    }

    @Override
    public void delete(KonoSuba konoSuba) {
        konoSubaDao.delete(konoSuba);
    }

    @Override
    public KonoSuba update(KonoSuba konoSuba) {
        if (checkData(konoSuba))
            return konoSubaDao.update(konoSuba);
        else {
            System.out.println("Data is wrong!!");
            return null;
        }
    }

    @Override
    public List<KonoSuba> findAll() {
        return konoSubaDao.findAll();
    }

    @Override
    public KonoSuba findOne(String cardId) {
        return konoSubaDao.findOne(cardId);
    }

    @Override
    public KonoSuba findOneByName(String name){
        return konoSubaDao.findOneByName(name);
    }

    private Boolean checkData(KonoSuba konoSuba){
        return true;
    }
}
