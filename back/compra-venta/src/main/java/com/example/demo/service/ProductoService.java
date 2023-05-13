package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.example.demo.modelo.Producto;
import com.example.demo.repositorio.ProductoRepository;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto buscarProducto(Integer id) {
        Optional<Producto> productoOptional = productoRepository.findById(id);
        if (productoOptional.isPresent()) {
            return productoOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El producto no existe");
        }
    }

    public Producto actualizarProducto(Integer id, Producto producto) {
        Optional<Producto> productoOptional = productoRepository.findById(id);
        if (productoOptional.isPresent()) {
            Producto productoExistente = productoOptional.get();
            productoExistente.setNombre(producto.getNombre());
            productoExistente.setPrecio(producto.getPrecio());
            productoExistente.setCantidad(producto.getCantidad());
            productoExistente.setDescripcion(producto.getDescripcion());
            return productoRepository.save(productoExistente);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El producto no existe");
        }
    }

    public void borrarProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}
