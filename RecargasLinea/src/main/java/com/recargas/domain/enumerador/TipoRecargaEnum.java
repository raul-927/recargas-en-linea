package com.recargas.domain.enumerador;

public enum TipoRecargaEnum {
	RECARGA(1, "RECARGA"), PAQUETE(2, "PAQUETE");
	
	private int id;
	private String descripcion;
	
	
	private TipoRecargaEnum(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	

}
