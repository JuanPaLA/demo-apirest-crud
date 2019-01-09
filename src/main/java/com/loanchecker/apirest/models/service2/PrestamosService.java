package com.loanchecker.apirest.models.service2;

import java.util.List;

import com.loanchecker.apirest.models.entity2.Prestamos;

public interface PrestamosService {
	
	public List<Prestamos> getPrestamos();

	public void savePrestamo(Prestamos theCustomer);

	public Prestamos getPrestamo(Integer theId);

	public void deletePrestamo(Integer theId);

}
