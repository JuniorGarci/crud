package com.example.expo.unah.lenguajes.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expo.unah.lenguajes.modelo.Cliente;
import com.example.expo.unah.lenguajes.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {
   
    @Autowired
	private ClienteServiceImpl clientesimpl;

    @GetMapping("/listarclientes")
	  public List<Cliente> obtenerlosClientes() {
	        return clientesimpl.obtenerClientes();
	    }

    @GetMapping("/buscar/{id}")
	public Cliente buscarCliente(@PathVariable int id) {
		return clientesimpl.obtenerCliente(id);
	}

    @PostMapping("/guardar")
	public ResponseEntity<?> guardarCliente(@RequestBody Cliente cliente) {
		Cliente clienteGuardado = clientesimpl.guardar(cliente);
		return ResponseEntity.ok(clienteGuardado);
	}

    @DeleteMapping("eliminar/{id}")
	public ResponseEntity<?> eliminar(@PathVariable int id) {
		clientesimpl.eliminar(id);
		return ResponseEntity.ok(null);
	}
}
