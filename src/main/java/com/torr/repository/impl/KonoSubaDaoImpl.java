package com.torr.repository.impl;

import com.torr.domain.KonoSuba;
import com.torr.repository.KonoSubaDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class KonoSubaDaoImpl implements KonoSubaDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public KonoSuba insert(KonoSuba card) {
        //INSERT INTO konosuba VALUES('1882', 'Aqua', 3237, 1567, 427, 0, 'God')
        return null;
    }

    @Override
    public void delete(KonoSuba card) {
        //DELETE FROM konosuba WHERE card_id_ = '1882';

    }

    @Override
    public KonoSuba update(KonoSuba card) {
        //UPDATE konosuba SET name='IdioticGoddess' WHERE card_id_ = '1882'
        return null;
    }

    @Override
    public List<KonoSuba> findAll() {
        //SELECT * FROM konosuba
        return null;
    }

    @Override
    public KonoSuba findOne(String cardId) {
        //SELECT * FROM konosuba WHERE card_id_ = '1882'
        return null;
    }
}
