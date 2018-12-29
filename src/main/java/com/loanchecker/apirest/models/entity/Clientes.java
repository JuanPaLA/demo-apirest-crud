package com.loanchecker.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="dni")
	private int dni;
	
	@Column(name="telfijo")
	private String telFijo;
	
	@Column(name="domcobro")
	private String domCobro;
	
	@Column(name="domsec")
	private String domicilioSecundario;
	
	@Column(name="barrio")
	private String barrio;
	
	public Clientes() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setFirstName(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setLastName(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEmail(int edad) {
		this.edad = edad;
	}
	
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getTelFijo() {
		return telFijo;
	}

	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}

	public String getDomicilioCobro() {
		return domCobro;
	}

	public void setDomicilioCobro(String domicilioCobro) {
		this.domCobro = domicilioCobro;
	}

	public String getDomicilioSecundario() {
		return domicilioSecundario;
	}

	public void setDomicilioSecundario(String domicilioSecundario) {
		this.domicilioSecundario = domicilioSecundario;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", celular="
				+ celular + ", dni=" + dni + ", telFijo=" + telFijo + ", domicilioCobro=" + domCobro
				+ ", domicilioSecundario=" + domicilioSecundario + ", barrio=" + barrio + "]";
	}

}