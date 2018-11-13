package com.torr.repository.impl;

import com.torr.domain.KonoSuba;
import com.torr.repository.KonoSubaDao;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class KonoSubaDaoImpl implements KonoSubaDao {

    @Resource
    private JdbcTemplate jdbcTemplate;
    //.execute(SQL) 單單就只是執行
    //.update(SQL) 回傳的是int 表示有幾筆資料受到影響


    @Override
    public KonoSuba insert(KonoSuba konoSuba) {

            return jdbcTemplate.update("INSERT INTO KONOSUBA(" +
                        "card_id_, name_, hp_, atk_, rec_, sex_, race_) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)",
                konoSuba.getCardId(),
                konoSuba.getName(),
                konoSuba.getHp(),
                konoSuba.getAtk(),
                konoSuba.getRec(),
                konoSuba.getSex(),
                konoSuba.getRace()) > 0 ? findOne(konoSuba.getCardId()) : null;
    }

    @Override
    public void delete(KonoSuba konoSuba) {
        jdbcTemplate.update("DELETE  FROM konosuba WHERE card_id_ = ?",
                konoSuba.getCardId());
    }

    @Override
    public KonoSuba update(KonoSuba konoSuba) {
        return jdbcTemplate.update("UPDATE konosuba " +
                "SET name_ = ?,hp_ = ?, atk_ = ?, rec_ = ?, sex_ = ?, race_ = ?" +
                "WHERE card_id_ =?",
                konoSuba.getName(),
                konoSuba.getHp(),
                konoSuba.getAtk(),
                konoSuba.getRec(),
                konoSuba.getSex(),
                konoSuba.getRace(),
                konoSuba.getCardId()) > 0 ? findOne(konoSuba.getCardId()) : null;
    }

    @Override
    public List<KonoSuba> findAll() {
        List<KonoSuba> result = jdbcTemplate.query("SELECT card_id_, name_, hp_, atk_, rec_, sex_, race_ " +
                "FROM konosuba", new KonoSubaMapper());
        return result.size() == 0 ? null : result;
    }

    @Override
    public KonoSuba findOne(String cardId) {
        KonoSuba konoSuba;
        try {
            konoSuba = (KonoSuba) jdbcTemplate.queryForObject(
                    "SELECT card_id_, name_, hp_, atk_, rec_, sex_, race_ " +
                        "FROM konosuba WHERE card_id_ = ?",new Object[]{cardId},
                        new KonoSubaMapper());
        } catch (EmptyResultDataAccessException e) {
            konoSuba = null;
        }

        return konoSuba;
    }

    @Override
    public KonoSuba findOneByName(String name) {
        KonoSuba konoSuba;
        try {
            konoSuba = (KonoSuba) jdbcTemplate.queryForObject(
                    "SELECT card_id_, name_, hp_, atk_, rec_, sex_, race_ " +
                        "FROM konosuba WHERE name_ = ?",new Object[]{name},
                        new KonoSubaMapper());
        } catch (EmptyResultDataAccessException e) {
            konoSuba = null;
        }

        return konoSuba;
    }

    class KonoSubaMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            KonoSuba konoSuba = new KonoSuba();
            konoSuba.setCardId(resultSet.getString("card_id_"));
            konoSuba.setName(resultSet.getString("name_"));
            konoSuba.setHp(resultSet.getInt("hp_"));
            konoSuba.setAtk(resultSet.getInt("atk_"));
            konoSuba.setRec(resultSet.getInt("rec_"));
            konoSuba.setSex(resultSet.getBoolean("sex_"));
            konoSuba.setRace(resultSet.getString("race_"));
            return konoSuba;
        }
    }
}


