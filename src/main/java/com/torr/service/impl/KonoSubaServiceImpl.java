package com.torr.service.impl;

import com.torr.domain.KonoSuba;
import com.torr.repository.KonoSubaDao;
import com.torr.repository.KonoSubaRepository;
import com.torr.service.KonoSubaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class KonoSubaServiceImpl implements KonoSubaService {
    
    @Resource
    private KonoSubaRepository konoSubaRepository;

    @Override
    public KonoSuba insert(KonoSuba konoSuba) {
        if (checkData(konoSuba))
            return konoSubaRepository.save(konoSuba);
        else{
            System.out.println("Data is wrong!!");
            return null;
        }
    }

    @Override
    public void delete(KonoSuba konoSuba) {
        konoSubaRepository.delete(konoSuba);
    }

    @Override
    public KonoSuba update(KonoSuba konoSuba) {
        if (checkData(konoSuba))
            return konoSubaRepository.save(konoSuba);
        else {
            System.out.println("Data is wrong!!");
            return null;
        }
    }

    @Override
    public List<KonoSuba> findAll() {
        return konoSubaRepository.findAll();
    }

    @Override
    public KonoSuba findOne(String cardId) {
        return konoSubaRepository.getOne(cardId);
    }

    @Override
    public KonoSuba findOneByName(String name){
        return konoSubaRepository.findByName(name);
    }

    public List<KonoSuba> findByNameContains(String nameContains){
        return konoSubaRepository.findByNameContains(nameContains);
    }

    private Boolean checkData(KonoSuba konoSuba){
        return true;
    }
}
