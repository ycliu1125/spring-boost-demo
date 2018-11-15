package com.torr.service.impl;

import com.torr.domain.KonoSuba;
import com.torr.domain.KonoSubaSkill;
import com.torr.repository.KonoSubaRepository;
import com.torr.service.KonoSubaService;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class KonoSubaServiceImpl implements KonoSubaService {

    @Resource
    private KonoSubaRepository konoSubaRepository;

    @Override
    public KonoSuba insert(KonoSuba konoSuba) {
        return konoSubaRepository.save(konoSuba);
    }

    @Override
    public void delete(KonoSuba konoSuba) {
        konoSubaRepository.delete(konoSuba);
    }

    @Override
    public KonoSuba update(KonoSuba konoSuba) {
        return konoSubaRepository.save(konoSuba);
    }


    @Override
    public List<KonoSuba> findAll() {
        return konoSubaRepository.findAll();
    }

    @Override
    public KonoSuba findOne(String cardId) {
        KonoSuba target;
        try {
            target = konoSubaRepository.getOne(cardId);
        } catch (JpaObjectRetrievalFailureException | EntityNotFoundException e) {
            target = null;
        }
        return target;
    }

    @Override
    public KonoSuba findOneByName(String name) {
        return konoSubaRepository.findByName(name);
    }

    @Override
    public List<KonoSuba> findByNameContains(String nameContains) {
        return konoSubaRepository.findByNameContains(nameContains);
    }

    @Override
    public List<KonoSuba> findBySkill(KonoSubaSkill skill) {
        return konoSubaRepository.findBySkill(skill);
    }

}
