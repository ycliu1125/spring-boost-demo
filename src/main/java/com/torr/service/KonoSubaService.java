package com.torr.service;

import com.torr.domain.KonoSuba;
import com.torr.domain.KonoSubaSkill;

import java.util.List;

public interface KonoSubaService extends BaseService1<KonoSuba> {
    List<KonoSuba> findByNameContains(String nameContains);

    List<KonoSuba> findBySkill(KonoSubaSkill skill);
}
