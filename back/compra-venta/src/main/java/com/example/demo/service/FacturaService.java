package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorio.FacturaRepository;
import com.example.demo.modelo.Factura;

@Service
public class FacturaService {
	
	@Autowired
	private FacturaRepository facturaRepository;
	
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }
    
    public Factura findById(Integer id) {
        return facturaRepository.findById(id).orElse(null);
    }
    
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }
    
    public void deleteById(Integer id) {
        facturaRepository.deleteById(id);
    }
	
}