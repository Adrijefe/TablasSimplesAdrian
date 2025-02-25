package com.adrian.repositoris;

import com.adrian.model.franquicia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranquiciaRepository extends JpaRepository<franquicia, Long> {
}
