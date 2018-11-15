package com.torr.repository;

import com.torr.domain.KonoSubaSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KonoSubaSkillRepository extends JpaRepository<KonoSubaSkill, String> {
    KonoSubaSkill findByName(String name);
}
