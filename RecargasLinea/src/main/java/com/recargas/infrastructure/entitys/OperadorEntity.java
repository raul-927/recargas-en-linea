package com.recargas.infrastructure.entitys;

import java.io.Serializable;

import com.recargas.domain.models.Recarga;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "operador")
public class OperadorEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int operadorId;
	private String nombre;
	
	@OneToOne
	private RecargaEntity recarga;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public RecargaEntity getRecarga() {
		return recarga;
	}
	public void setRecarga(RecargaEntity recarga) {
		this.recarga = recarga;
	}
	public int getOperadorId() {
		return operadorId;
	}
	public void setOperadorId(int operadorId) {
		this.operadorId = operadorId;
	}

}
