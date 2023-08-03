package com.recargas.domain.models;

import com.recargas.domain.enumerador.TipoPersonaEnum;

public class Persona {
	private int personaId;
	private String nombre;
	private String documento;
	private TipoPersonaEnum tipoPersona;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public TipoPersonaEnum getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(TipoPersonaEnum tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public int getPersonaId() {
		return personaId;
	}
	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}
}
