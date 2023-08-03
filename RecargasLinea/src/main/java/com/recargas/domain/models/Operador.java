package com.recargas.domain.models;

public class Operador {
	private int operadorId;
	private String nombre;
	private Recarga recarga;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Recarga getRecarga() {
		return recarga;
	}
	public void setRecarga(Recarga recarga) {
		this.recarga = recarga;
	}
	public int getOperadorId() {
		return operadorId;
	}
	public void setOperadorId(int operadorId) {
		this.operadorId = operadorId;
	}
	

}
