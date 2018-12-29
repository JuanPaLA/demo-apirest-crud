package com.loanchecker.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loanchecker.apirest.models.dao.ClientesDAO;
import com.loanchecker.apirest.models.entity.Clientes;

@Service
public class ClientesServiceImpl implements ClientesService {

	// need to inject customer DAO
	@Autowired
	private ClientesDAO clientesDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Clientes> getCustomers() {
		return (List<Clientes>) clientesDAO.findAll();
	}

	@Override
	@Transactional
	public void saveCustomer(Clientes theCustomer) {

		clientesDAO.save(theCustomer);
	}

	@Override
	@Transactional(readOnly=true)
	public Clientes getCustomer(Integer theId) {

		return clientesDAO.findById(theId).get();
	}

	@Override
	@Transactional
	public void deleteCustomer(Integer theId) {

		clientesDAO.deleteById(theId);
	}

}
