package com.torr.service.impl;

import com.torr.domain.KonoSuba;
import com.torr.repository.KonoSubaDao;
import com.torr.service.KonoSubaDaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class KonoSubaDaoServiceImpl implements KonoSubaDaoService {

    @Resource
    KonoSubaDao konoSubaDao;

    @Override
    public List<KonoSuba> findBy(int byWhat, String value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "card_id_");
        map.put(2, "name_");
        map.put(3, "hp_");
        map.put(4, "atk_");
        map.put(5, "rec_");
        map.put(6, "sex_");
        map.put(7, "race_");
        return konoSubaDao.findBy(map.get(byWhat), value);
    }

    @Override
    public KonoSuba insert(KonoSuba konoSuba) {
        return konoSubaDao.insert(konoSuba);
    }

    @Override
    public void delete(KonoSuba konoSuba) {

    }

    @Override
    public KonoSuba update(KonoSuba konoSuba) {
        return null;
    }

    @Override
    public List<KonoSuba> findAll() {
        return null;
    }

    @Override
    public KonoSuba findOne(String pk) {
        return null;
    }

    @Override
    public KonoSuba findOneByName(String name) {
        return null;
    }

}
