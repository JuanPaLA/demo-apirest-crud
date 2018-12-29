package com.loanchecker.apirest.models.entity2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prestamos")
public class Prestamos {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Integer id;
		
		@Column(name="idcliente")
		private String idcliente;
		
		@Column(name="idpagos")
		private String idpagos;
		
		@Column(name="monto")
		private int monto;
		
		@Column(name="tasa")
		private String tasa;
		
		@Column(name="montosaldado")
		private int montosaldado;
		
		@Column(name="cantidadpagos")
		private String cantidadpagos;
		
		@Column(name="diaspagados")
		private String diaspagados;
		
		@Column(name="diasnopagados")
		private String diasnopagados;
		
		@Column(name="fechainicio")
		private String fechainicio;
		
//		@Column(name="estado")
//		private boolean estado;
		
		@Column(name="pagos")
		private Integer pagos;

		
		public Prestamos() {
			
		}
		
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getIdcliente() {
			return idcliente;
		}

		public void setIdcliente(String idcliente) {
			this.idcliente = idcliente;
		}

		public String getIdpagos() {
			return idpagos;
		}

		public void setIdpagos(String idpagos) {
			this.idpagos = idpagos;
		}

		public int getMonto() {
			return monto;
		}

		public void setMonto(int monto) {
			this.monto = monto;
		}

		public String getTasa() {
			return tasa;
		}

		public void setTasa(String tasa) {
			this.tasa = tasa;
		}

		public int getMontosaldado() {
			return montosaldado;
		}

		public void setMontosaldado(int montosaldado) {
			this.montosaldado = montosaldado;
		}

		public String getCantidadpagos() {
			return cantidadpagos;
		}

		public void setCantidadpagos(String cantidadpagos) {
			this.cantidadpagos = cantidadpagos;
		}

		public String getDiaspagados() {
			return diaspagados;
		}

		public void setDiaspagados(String diaspagados) {
			this.diaspagados = diaspagados;
		}

		public String getDiasnopagados() {
			return diasnopagados;
		}

		public void setDiasnopagados(String diasnopagados) {
			this.diasnopagados = diasnopagados;
		}

		public String getFechainicio() {
			return fechainicio;
		}

		public void setFechainicio(String fechainicio) {
			this.fechainicio = fechainicio;
		}

//		public boolean isEstado() {
//			return estado;
//		}
//
//		public void setEstado(boolean estado) {
//			this.estado = estado;
//		}

		public Integer getPagos() {
			return pagos;
		}

		public void setPagos(Integer pagos) {
			this.pagos = pagos;
		}

		@Override
		public String toString() {
			return "Prestamos [id=" + id + ", idcliente=" + idcliente + ", idpagos=" + idpagos + ", monto=" + monto
					+ ", tasa=" + tasa + ", montosaldado=" + montosaldado + ", cantidadpagos=" + cantidadpagos
					+ ", diaspagados=" + diaspagados + ", diasnopagados=" + diasnopagados + ", fechainicio=" + fechainicio
					+ /*", estado=" + estado + */", pagos=" + pagos + "]";
		}

		
	}