package com.loanchecker.apirest.models.service2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loanchecker.apirest.models.dao2.PruebaDAO;
import com.loanchecker.apirest.models.entity2.Prueba;

@Service
public class PruebaServiceImpl implements PruebaService {

	// need to inject prueba DAO
	@Autowired
	private PruebaDAO pruebaDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Prueba> getPruebas() {
		return (List<Prueba>) pruebaDAO.findAll();
	}

	@Override
	@Transactional
	public void savePrueba(Prueba theCustomer) {

		pruebaDAO.save(theCustomer);
	}

	@Override
	@Transactional(readOnly=true)
	public Prueba getPrueba(Integer theId) {

		return pruebaDAO.findById(theId).get();
	}

	@Override
	@Transactional
	public void deletePrueba(Integer theId) {

		pruebaDAO.deleteById(theId);
	}

}
