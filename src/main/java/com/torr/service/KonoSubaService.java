package com.torr.service;

import com.torr.domain.KonoSuba;
import java.util.List;

public interface KonoSubaService {
    KonoSuba insert(KonoSuba card);
    void delete(KonoSuba card);
    KonoSuba update(KonoSuba card);
    List<KonoSuba> findAll();
    KonoSuba findOne(String cardId);
    KonoSuba findOneByName (String name);

}
