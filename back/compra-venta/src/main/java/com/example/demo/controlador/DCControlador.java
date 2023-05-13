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
import com.example.demo.modelo.DC;
import com.example.demo.service.DCService;

@RestController
@CrossOrigin
@RequestMapping("/dc")
public class DCControlador {

	@Autowired
	private DCService dCService;
	
	@GetMapping("")
    public List<DC> findAll() {
        return dCService.findAll();
    }

    @PostMapping("")
    public DC save(@RequestBody DC dc) {
    	return dCService.save(dc);
    }
    
    @GetMapping("/{id}")
    public DC findById(@PathVariable("id") Integer id) {
        return dCService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
    	dCService.deleteById(id);
    }
}
