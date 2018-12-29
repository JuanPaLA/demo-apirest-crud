package com.loanchecker.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loanchecker.apirest.models.entity.Clientes;
import com.loanchecker.apirest.models.entity2.Prestamos;
import com.loanchecker.apirest.models.entity3.Cobros;
import com.loanchecker.apirest.models.service.ClientesService;
import com.loanchecker.apirest.models.service2.PrestamosService;
import com.loanchecker.apirest.models.service3.CobrosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CustomerRestController {

	// injection dependency
	@Autowired
	private ClientesService clientesService;
	
	
		//injection dependency
		@Autowired
		private PrestamosService prestamosService;
	
			//injection dependency
			@Autowired
			private CobrosService cobroService;

	@GetMapping("/clientes")
	public List<Clientes> getCustomers() {
		return clientesService.getCustomers();
	}

		@GetMapping("/prestamos")
		public List<Prestamos> getPruebas(){
			return prestamosService.getPruebas();
		}
	
			@GetMapping("/cobros")
			public List<Cobros> getCobros(){
				return cobroService.getCobros();
			}
			
		
	@GetMapping("/clientes/{customerId}")
	public Clientes getCustomer(@PathVariable int customerId) {

		Clientes clientes = clientesService.getCustomer(customerId);

		return clientes;
	}

		@GetMapping("/prestamos/{pruebaId}")
		public Prestamos getPrueba(@PathVariable int pruebaId) {
			
			Prestamos p = prestamosService.getPrueba(pruebaId);
			
			return p;
		}
	
	
	// add mapping for POST /customers - add new customer

	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes addCustomer(@RequestBody Clientes clientes) {

		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		clientes.setId(null);

		clientesService.saveCustomer(clientes);

		return clientes;
	}
	
		// add mapping for POST /prestamos - add new prestamo
		@PostMapping("/prestamos")
		@ResponseStatus(HttpStatus.CREATED)
		public Prestamos addPrueba(@RequestBody Prestamos prestamo) {
		
			// also just in case the pass an id in JSON ... set id to 0
			// this is force a save of new item ... instead of update
		
			prestamo.setId(null);
		
			prestamosService.savePrueba(prestamo);
		
			return prestamo;
		}
	
	// add mapping for PUT /customers - update existing customer
	
	@PutMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes updateCustomer(@RequestBody Clientes clientes) {
		
		clientesService.saveCustomer(clientes);
		
		return clientes;
	}
	
	
	//add mapping for DELETE /customers/{customerId} - delete existing customer
	@DeleteMapping("/clientes/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable int customerId) {
		
		clientesService.deleteCustomer(customerId);
	}
	
		//add mapping for DELETE /prestamos/{customerId} - delete existing prestamo
		@DeleteMapping("/prestamos/{customerId}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void deletePrueba(@PathVariable int customerId) {
			
			prestamosService.deletePrueba(customerId);
		}
	
}
