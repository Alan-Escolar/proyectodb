package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {
    
}
