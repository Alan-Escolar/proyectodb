
package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.CO;

@Repository
public interface CORepository extends JpaRepository<CO, Integer> {
}
