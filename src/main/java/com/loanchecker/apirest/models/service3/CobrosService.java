package com.loanchecker.apirest.models.service3;

import java.util.List;

import com.loanchecker.apirest.models.entity2.Prestamos;
import com.loanchecker.apirest.models.entity3.*;

public interface CobrosService {
	
	public List<Cobros> getCobros();

	public void saveCobro(Cobros theCustomer);

	public Cobros getCobro(Integer theId);

	public void deleteCobro(Integer theId);
	
}
