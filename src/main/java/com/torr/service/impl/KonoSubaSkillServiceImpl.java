package com.torr.service.impl;

import com.torr.domain.KonoSubaSkill;
import com.torr.repository.KonoSubaSkillRepository;
import com.torr.service.KonoSubaSkillService;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;

import javax.annotation.Resource;
import javax.persistence.EntityNotFoundException;
import java.util.List;

public class KonoSubaSkillServiceImpl implements KonoSubaSkillService {

    @Resource
    private KonoSubaSkillRepository konoSubaSkillRepository;

    @Override
    public KonoSubaSkill insert(KonoSubaSkill skill) {
        return konoSubaSkillRepository.save(skill);
    }

    @Override
    public void delete(KonoSubaSkill skill) {
        konoSubaSkillRepository.delete(skill);
    }

    @Override
    public KonoSubaSkill update(KonoSubaSkill skill) {
        return konoSubaSkillRepository.save(skill);
    }

    @Override
    public List<KonoSubaSkill> findAll() {
        return konoSubaSkillRepository.findAll();
    }

    @Override
    public KonoSubaSkill findOne(String pk) {
        KonoSubaSkill target;
        try {
            target = konoSubaSkillRepository.getOne(pk);
        } catch (JpaObjectRetrievalFailureException | EntityNotFoundException e) {
            target = null;
        }
        return target;

    }

    @Override
    public KonoSubaSkill findOneByName(String name) {
        return konoSubaSkillRepository.findByName(name);
    }
}
