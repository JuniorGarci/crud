package com.example.expo.unah.lenguajes.services;

import java.util.List;

import com.example.expo.unah.lenguajes.modelo.Cliente;

public interface ClientesServices {
    List<Cliente> obtenerClientes();
	 Cliente obtenerCliente(int id);
	 Cliente guardar(Cliente cliente);
	 void eliminar(int id);
}
