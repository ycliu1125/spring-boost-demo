package com.torr.repository;

import com.torr.domain.KonoSuba;

public interface KonoSubaDao extends BaseDao<KonoSuba> {
    KonoSuba findOneByName(String name);
}
