package com.torr.service;

import com.torr.domain.KonoSuba;

import java.util.List;

public interface KonoSubaDaoService extends BaseService1<KonoSuba> {
    public List<KonoSuba> findBy(int byWhat, String value);
}
