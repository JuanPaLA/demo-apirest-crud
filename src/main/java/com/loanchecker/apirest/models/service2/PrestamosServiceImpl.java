package com.loanchecker.apirest.models.service2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loanchecker.apirest.models.dao2.PrestamosDAO;
import com.loanchecker.apirest.models.entity2.Prestamos;

@Service
public class PrestamosServiceImpl implements PrestamosService {

	// need to inject prueba DAO
	@Autowired
	private PrestamosDAO prestamosDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Prestamos> getPruebas() {
		return (List<Prestamos>) prestamosDAO.findAll();
	}

	@Override
	@Transactional
	public void savePrueba(Prestamos theCustomer) {

		prestamosDAO.save(theCustomer);
	}

	@Override
	@Transactional(readOnly=true)
	public Prestamos getPrueba(Integer theId) {

		return prestamosDAO.findById(theId).get();
	}

	@Override
	@Transactional
	public void deletePrueba(Integer theId) {

		prestamosDAO.deleteById(theId);
	}

}
