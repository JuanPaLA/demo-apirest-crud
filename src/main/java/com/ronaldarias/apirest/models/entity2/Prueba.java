package com.ronaldarias.apirest.models.entity2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prueba")
public class Prueba {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="col1")
	private Integer col1;
		
	public Prueba() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCol1() {
		return col1;
	}

	public void setFirstName(Integer col1) {
		this.col1 = col1;
	}

	@Override
	public String toString() {
		return "Prueba [id=" + id + ", col1=" + col1 + "]";
	}

}
