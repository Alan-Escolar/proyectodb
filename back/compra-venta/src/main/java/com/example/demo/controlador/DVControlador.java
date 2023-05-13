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
import com.example.demo.modelo.DV;
import com.example.demo.service.DVService;

@RestController
@CrossOrigin
@RequestMapping("/dv")
public class DVControlador {

	@Autowired
	private DVService dVService;
	
	@GetMapping("")
    public List<DV> findAll() {
        return dVService.findAll();
    }

    @PostMapping("")
    public DV save(@RequestBody DV dv) {
    	return dVService.save(dv);
    }
    
    @GetMapping("/{id}")
    public DV findById(@PathVariable("id") Integer id) {
        return dVService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
    	dVService.deleteById(id);
    }
}
