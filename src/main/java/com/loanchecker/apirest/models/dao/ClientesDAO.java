package com.loanchecker.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.loanchecker.apirest.models.entity.Clientes;

public interface ClientesDAO extends CrudRepository<Clientes, Integer> {

}
