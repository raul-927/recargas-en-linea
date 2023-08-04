package com.recargas.domain.models;

import java.util.List;

public class Operador {
	private int operadorId;
	private String nombre;
	private List<Recarga> recargas;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getOperadorId() {
		return operadorId;
	}
	public void setOperadorId(int operadorId) {
		this.operadorId = operadorId;
	}
	public List<Recarga> getRecargas() {
		return recargas;
	}
	public void setRecargas(List<Recarga> recargas) {
		this.recargas = recargas;
	}
	

}
