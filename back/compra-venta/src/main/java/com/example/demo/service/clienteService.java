package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorio.ClientesRepository;
import java.util.List;
import java.util.Optional;
import com.example.demo.modelo.clientes;

@Service
public class clienteService {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	public List<clientes> obtenerTodos(){
		return clientesRepository.findAll();
	}
	
	public Optional<clientes> obtenerPorId(int id){
		return clientesRepository.findById(id);
	}
	
    public clientes guardar(clientes cliente) {
        return clientesRepository.save(cliente);
    }
    
    public void eliminar(int id) {
        clientesRepository.deleteById(id);
    }
}
