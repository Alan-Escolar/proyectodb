package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Compra;
import com.example.demo.service.CompraService;

@RestController
@CrossOrigin
@RequestMapping("/compras")
public class CompraControlador {
    
    @Autowired
    private CompraService compraService;
    
    @GetMapping("")
    public List<Compra> findAll() {
        return compraService.findAll();
    }

    @PostMapping("")
    public Compra save(@RequestBody Compra compra) {
    	return compraService.save(compra);
    }
    
    @GetMapping("/{id}")
    public Compra findById(@PathVariable("id") Integer id) {
        return compraService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        compraService.deleteById(id);
    }
}

