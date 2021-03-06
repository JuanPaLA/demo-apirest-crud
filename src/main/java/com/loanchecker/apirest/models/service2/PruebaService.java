package com.loanchecker.apirest.models.service2;

import java.util.List;

import com.loanchecker.apirest.models.entity2.Prueba;

public interface PruebaService {
	
	public List<Prueba> getPruebas();

	public void savePrueba(Prueba theCustomer);

	public Prueba getPrueba(Integer theId);

	public void deletePrueba(Integer theId);

}
