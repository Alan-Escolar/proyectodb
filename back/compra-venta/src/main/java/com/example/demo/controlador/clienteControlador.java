package com.example.demo.controlador;

import com.example.demo.modelo.clientes;
import com.example.demo.repositorio.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/clientes")
public class clienteControlador {

	@Autowired ClientesRepository clienteRepository;
	
	@GetMapping("")
	 public List<clientes> obtenerClientes() {
        return clienteRepository.findAll();
    }

    @PostMapping("")
    public clientes crearCliente(@Valid @RequestBody clientes cliente) {
        return clienteRepository.save(cliente);
    }
    
    @GetMapping("/{id}")
    public Optional<clientes> obtenerClientePorId(@PathVariable("id") int id) {
    	return clienteRepository.findById(id);
    }

    @PutMapping("/{id}")
    public clientes actualizarCliente(@PathVariable("id") int id, @Valid @RequestBody clientes clienteActualizado) {
        Optional<clientes> clienteExistente = clienteRepository.findById(id);
        if (clienteExistente.isPresent()) {
            clienteActualizado.setId(clienteExistente.get().getId());
            return clienteRepository.save(clienteActualizado);
        } else {
            return null; // o lanzar una excepción
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable("id") int id) {
        clienteRepository.deleteById(id);
    }
	
}
