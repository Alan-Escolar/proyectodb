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
import com.example.demo.modelo.CO;
import com.example.demo.service.COService;

@RestController
@CrossOrigin
@RequestMapping("/co")
public class COControlador {

	@Autowired
	private COService cOService;
	
	@GetMapping("")
    public List<CO> findAll() {
        return cOService.findAll();
    }

    @PostMapping("")
    public CO save(@RequestBody CO dc) {
    	return cOService.save(dc);
    }
    
    @GetMapping("/{id}")
    public CO findById(@PathVariable("id") Integer id) {
        return cOService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
    	cOService.deleteById(id);
    }
}
