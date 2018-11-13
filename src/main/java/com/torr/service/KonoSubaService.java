package com.torr.service;

import com.torr.domain.KonoSuba;

import java.util.List;

public interface KonoSubaService extends BaseService1<KonoSuba> {
    List<KonoSuba> findByNameContains(String nameContains);
}
