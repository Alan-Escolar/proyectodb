package com.example.demo.repositorio;

import com.example.demo.modelo.clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<clientes, Integer>{

}
