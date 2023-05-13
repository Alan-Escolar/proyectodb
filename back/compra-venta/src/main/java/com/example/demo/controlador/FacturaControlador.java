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
import com.example.demo.modelo.Factura;
import com.example.demo.service.FacturaService;

@RestController
@CrossOrigin
@RequestMapping("/facturas")
public class FacturaControlador{
	
	@Autowired
	private FacturaService facturaService;
	
	@GetMapping("")
    public List<Factura> findAll() {
        return facturaService.findAll();
    }

    @PostMapping("")
    public Factura save(@RequestBody Factura factura) {
    	return facturaService.save(factura);
    }
    
    @GetMapping("/{id}")
    public Factura findById(@PathVariable("id") Integer id) {
        return facturaService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        facturaService.deleteById(id);
    }
}