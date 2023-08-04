package com.recargas.infrastructure.entitys;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "operador")
public class OperadorEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int operadorId;
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<RecargaEntity> recargas;
	
	
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
	public List<RecargaEntity> getRecargas() {
		return recargas;
	}
	public void setRecargas(List<RecargaEntity> recargas) {
		this.recargas = recargas;
	}

}
