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

import com.loanchecker.apirest.models.entity2.Prestamos;
import com.loanchecker.apirest.models.service2.PrestamosService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/prestamos")
public class PrestamosRestController {
	
	//injection dependency
	@Autowired
	private PrestamosService prestamosService;
	
	@GetMapping("/")
	public List<Prestamos> getPrestamos(){
		return prestamosService.getPrestamos();
	}
	
	@GetMapping("/{pruebaId}")
	public Prestamos getPrestamo(@PathVariable int pruebaId) {
		
		Prestamos p = prestamosService.getPrestamo(pruebaId);
		
		return p;
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Prestamos addPrestamo(@RequestBody Prestamos prestamo) {
	
		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update
	
		prestamo.setId(null);
	
		prestamosService.savePrestamo(prestamo);
	
		return prestamo;
	}
	
	//add mapping for DELETE /prestamos/{customerId} - delete existing prestamo
	@DeleteMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePrestamo(@PathVariable int customerId) {
		
		prestamosService.deletePrestamo(customerId);
	}

	

}
