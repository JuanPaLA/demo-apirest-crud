package com.loanchecker.apirest.models.service;

import java.util.List;

import com.loanchecker.apirest.models.entity.Clientes;

public interface ClientesService {
	
	public List<Clientes> getCustomers();

	public void saveCustomer(Clientes theCustomer);

	public Clientes getCustomer(Integer theId);

	public void deleteCustomer(Integer theId);

}
