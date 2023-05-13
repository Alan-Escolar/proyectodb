package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorio.DVRepository;
import com.example.demo.modelo.DV;

@Service
public class DVService {
    
    @Autowired
    private DVRepository dVRepository;
    
    public List<DV> findAll() {
        return dVRepository.findAll();
    }
    
    public DV findById(Integer id) {
        return dVRepository.findById(id).orElse(null);
    }
    
    public DV save(DV dv) {
        return dVRepository.save(dv);
    }
    
    public void deleteById(Integer id) {
    	dVRepository.deleteById(id);
    }
}
