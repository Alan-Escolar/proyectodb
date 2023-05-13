package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.DV;

@Repository
public interface DVRepository extends JpaRepository<DV, Integer> {
}