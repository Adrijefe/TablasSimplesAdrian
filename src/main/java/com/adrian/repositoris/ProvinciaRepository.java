package com.adrian.repositoris;

import com.adrian.model.provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProvinciaRepository extends JpaRepository<provincia,Long> {
}
