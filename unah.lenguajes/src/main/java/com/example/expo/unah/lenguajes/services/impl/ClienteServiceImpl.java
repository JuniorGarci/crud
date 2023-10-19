package com.example.expo.unah.lenguajes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expo.unah.lenguajes.modelo.Cliente;
import com.example.expo.unah.lenguajes.repositories.ClientesRepository;
import com.example.expo.unah.lenguajes.services.ClientesServices;

@Service
public class ClienteServiceImpl implements ClientesServices{
    @Autowired
    private ClientesRepository clienteRepository;

    @Override
    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerCliente(int id) {
        return clienteRepository.findById(id).get();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminar(int id) {
        clienteRepository.deleteById(id);
    }
}
