package com.adrian.repositoris;

import com.adrian.model.pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaisRepository extends JpaRepository<pais, Long> {
}
