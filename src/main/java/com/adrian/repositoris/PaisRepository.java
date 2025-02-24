package com.adrian.repositoris;

import com.adrian.model.PAIS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaisRepository extends JpaRepository<PAIS, Long> {
}
