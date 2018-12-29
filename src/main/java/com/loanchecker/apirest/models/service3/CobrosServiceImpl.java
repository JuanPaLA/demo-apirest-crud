package com.loanchecker.apirest.models.service3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loanchecker.apirest.models.dao3.CobrosDAO;
import com.loanchecker.apirest.models.entity3.Cobros;

@Service
public class CobrosServiceImpl implements CobrosService{
	
	// need to inject cobros DAO
	@Autowired
	private CobrosDAO cobroDAO;

	//@Override
	@Transactional(readOnly=true)
	public List<Cobros> getCobros() {
		return (List<Cobros>) cobroDAO.findAll();
	}

	//@Override
	@Transactional
	public void saveCobro(Cobros theCustomer) {

		cobroDAO.save(theCustomer);
	}

	//@Override
	@Transactional(readOnly=true)
	public Cobros getCobro(Integer theId) {

		return cobroDAO.findById(theId).get();
	}

	//@Override
	@Transactional
	public void deleteCobro(Integer theId) {

		cobroDAO.deleteById(theId);
	}

	
}
