package com.loanchecker.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.loanchecker.apirest.models.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
