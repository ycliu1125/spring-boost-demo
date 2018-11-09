package com.torr.repository;

import com.torr.domain.KonoSuba;
import java.util.List;

public interface KonoSubaDao {
    KonoSuba insert(KonoSuba card);
    void delete(KonoSuba card);
    KonoSuba update(KonoSuba card);
    List<KonoSuba> findAll();
    KonoSuba findOne(String cardId);
}
