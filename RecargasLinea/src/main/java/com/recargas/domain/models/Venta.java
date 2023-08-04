package com.recargas.domain.models;

import java.math.BigDecimal;
import java.util.List;

public class Venta {
	private int ventaId;
	private Persona persona;
	private Operador operador;
	private Recarga recarga;
	private long	nroCelular;
	
	
	
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
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
	public Recarga getRecarga() {
		return recarga;
	}
	public void setRecarga(Recarga recarga) {
		this.recarga = recarga;
	}
}
