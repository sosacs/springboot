package com.empresa.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.empresa.springboot.app.model.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
