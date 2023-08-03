package com.recargas.domain.enumerador;

public enum TipoPersonaEnum {
	
	VENDEDOR(1, "VENDEDOR"), CLIENTE(2, "CLIENTE");
	
	private int id;
	private String descripcion;
	
	
	
	private TipoPersonaEnum(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String descripcion() {
		return descripcion;
	}
}
