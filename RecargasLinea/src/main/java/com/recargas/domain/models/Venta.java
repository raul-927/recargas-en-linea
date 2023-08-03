package com.recargas.domain.models;

import java.math.BigDecimal;

public class Venta {
	private int ventaId;
	private Persona persona;
	private Operador operador;
	private long	nroCelular;
	private BigDecimal cantidad;
	
	
	
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	public BigDecimal getCantidad() {
		return cantidad;
	}
	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
	public int getVentaId() {
		return ventaId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public long getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(long nroCelular) {
		this.nroCelular = nroCelular;
	}

}
