package com.example.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class micontrolador {
	
	@GetMapping("/saludo")
	public String saludar() {
		return "HOLA,MUNDO!";
	}

}
