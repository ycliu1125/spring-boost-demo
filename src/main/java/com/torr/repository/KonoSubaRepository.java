package com.torr.repository;

import com.torr.domain.KonoSuba;
import com.torr.domain.KonoSubaSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KonoSubaRepository extends JpaRepository<KonoSuba, String> {

    KonoSuba findByName(String name);

    List<KonoSuba> findByNameContains(String nameContains);

    List<KonoSuba> findBySkill(KonoSubaSkill skill);

}
