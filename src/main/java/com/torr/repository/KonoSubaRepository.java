package com.torr.repository;

import com.torr.domain.KonoSuba;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KonoSubaRepository extends JpaRepository<KonoSuba, String> {

    KonoSuba findByName(String name);

    List<KonoSuba> findByNameContains(String nameContains);

}
