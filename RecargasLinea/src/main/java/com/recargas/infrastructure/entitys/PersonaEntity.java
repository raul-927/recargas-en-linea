package com.recargas.infrastructure.entitys;

import java.io.Serializable;

import com.recargas.domain.enumerador.TipoPersonaEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "persona")
public class PersonaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "persona_id")
	private int personaId;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "documento")
	private String documento;
	
	@Enumerated(EnumType.STRING)
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
