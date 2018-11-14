package com.torr.repository;

import com.torr.domain.KonoSuba;

import java.util.List;

public interface KonoSubaDao extends BaseDao<KonoSuba> {
    KonoSuba findOneByName(String name);

    /**
     * 藉由一個 Map
     * 一個方法就可以By name,或者By id 等等
     *
     * @return KonoSuba
     */
    List<KonoSuba> findBy(String byWhat, String value);
}
