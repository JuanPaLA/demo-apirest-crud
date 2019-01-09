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
	public List<Prestamos> getPrestamos() {
		return (List<Prestamos>) prestamosDAO.findAll();
	}

	@Override
	@Transactional
	public void savePrestamo(Prestamos p) {

		prestamosDAO.save(p);
	}

	@Override
	@Transactional(readOnly=true)
	public Prestamos getPrestamo(Integer Id) {

		return prestamosDAO.findById(Id).get();
	}

	@Override
	@Transactional
	public void deletePrestamo(Integer Id) {

		prestamosDAO.deleteById(Id);
	}

}
