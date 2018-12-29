package com.loanchecker.apirest.models.entity3;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cobros")
public class Cobros {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id_cobro;
	
	@Column(name="idprestamo")
	private Integer idprestamo;
	
	@Column(name="idcliente")
	private Integer idCliente;
	
	@Column(name="idpago")
	private Integer idpago;
	
	@Column(name="idgestor")
	private Integer idgestor;
	
	@Column(name="monto")
	private double monto;
	
	@Column(name="montocobrado")
	private double montoCobrado;
	
	@Column(name="fechaCobro")
	private Date fechaCobro; // --> Date SQL
	
	public Cobros() {
		
	}

	public Integer getId_cobro() {
		return id_cobro;
	}

	public void setId_cobro(Integer id_cobro) {
		this.id_cobro = id_cobro;
	}

	public Integer getIdprestamo() {
		return idprestamo;
	}

	public void setIdprestamo(Integer idprestamo) {
		this.idprestamo = idprestamo;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdpago() {
		return idpago;
	}

	public void setIdpago(Integer idpago) {
		this.idpago = idpago;
	}

	public Integer getIdgestor() {
		return idgestor;
	}

	public void setIdgestor(Integer idgestor) {
		this.idgestor = idgestor;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getMontoCobrado() {
		return montoCobrado;
	}

	public void setMontoCobrado(double montoCobrado) {
		this.montoCobrado = montoCobrado;
	}

	public Date getFechaCobro() {
		return fechaCobro;
	}

	public void setFechaCobro(Date fechaCobro) {
		this.fechaCobro = fechaCobro;
	}
	
}
