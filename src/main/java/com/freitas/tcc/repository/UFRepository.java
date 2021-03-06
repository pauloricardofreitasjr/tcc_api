package com.freitas.tcc.repository;

import com.freitas.tcc.entity.UF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UFRepository extends JpaRepository<UF, Integer> {
}
