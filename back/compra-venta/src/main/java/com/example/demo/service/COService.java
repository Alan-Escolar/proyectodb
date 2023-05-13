package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositorio.CORepository;
import com.example.demo.modelo.CO;

@Service
public class COService {
    
    @Autowired
    private CORepository dCRepository;
    
    public List<CO> findAll() {
        return dCRepository.findAll();
    }
    
    public CO findById(Integer id) {
        return dCRepository.findById(id).orElse(null);
    }
    
    public CO save(CO dc) {
        return dCRepository.save(dc);
    }
    
    public void deleteById(Integer id) {
    	dCRepository.deleteById(id);
    }
}
