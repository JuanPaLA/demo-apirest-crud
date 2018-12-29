package com.loanchecker.apirest.models.service2;

import java.util.List;

import com.loanchecker.apirest.models.entity2.Prestamos;

public interface PrestamosService {
	
	public List<Prestamos> getPruebas();

	public void savePrueba(Prestamos theCustomer);

	public Prestamos getPrueba(Integer theId);

	public void deletePrueba(Integer theId);

}
