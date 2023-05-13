package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclientes;
	
	@NotBlank
	private String nombre;
	
	private String direccion;
	
	private String telefono;

	public int getId() {
        return idclientes;
    }

    public void setId(int id) {
        this.idclientes = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Constructor vacío
    public clientes() {
    }

    // Constructor con parámetros
    public clientes(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
	
	
}
