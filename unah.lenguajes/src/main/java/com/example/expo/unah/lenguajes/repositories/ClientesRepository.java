package com.example.expo.unah.lenguajes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.expo.unah.lenguajes.modelo.Cliente;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Integer> {

}
