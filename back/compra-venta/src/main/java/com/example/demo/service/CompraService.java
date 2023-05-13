package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorio.CompraRepository;
import com.example.demo.modelo.Compra;

@Service
public class CompraService {
    
    @Autowired
    private CompraRepository compraRepository;
    
    public List<Compra> findAll() {
        return compraRepository.findAll();
    }
    
    public Compra findById(Integer id) {
        return compraRepository.findById(id).orElse(null);
    }
    
    public Compra save(Compra compra) {
        return compraRepository.save(compra);
    }
    
    public void deleteById(Integer id) {
        compraRepository.deleteById(id);
    }
}
