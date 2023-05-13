package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorio.DCRepository;
import com.example.demo.modelo.DC;

@Service
public class DCService {
    
    @Autowired
    private DCRepository dCRepository;
    
    public List<DC> findAll() {
        return dCRepository.findAll();
    }
    
    public DC findById(Integer id) {
        return dCRepository.findById(id).orElse(null);
    }
    
    public DC save(DC dc) {
        return dCRepository.save(dc);
    }
    
    public void deleteById(Integer id) {
    	dCRepository.deleteById(id);
    }
}
