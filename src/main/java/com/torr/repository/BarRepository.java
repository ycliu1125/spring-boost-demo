package com.torr.repository;

import com.torr.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarRepository extends JpaRepository<Bar,String > {
}
