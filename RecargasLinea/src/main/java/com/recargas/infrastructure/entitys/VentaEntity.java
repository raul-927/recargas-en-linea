package com.recargas.infrastructure.entitys;

import java.io.Serializable;
import java.math.BigDecimal;

import com.recargas.domain.models.Operador;
import com.recargas.domain.models.Persona;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="venta")
public class VentaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ventaId;
	@OneToOne
	private PersonaEntity persona;
	
	@OneToOne
	private OperadorEntity operador;
	
	private long nroCelular;
	
	
	private BigDecimal cantidad;
	
	
	
	public OperadorEntity getOperador() {
		return operador;
	}
	public void setOperador(OperadorEntity operador) {
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
	public PersonaEntity getPersona() {
		return persona;
	}
	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}
	public long getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(long nroCelular) {
		this.nroCelular = nroCelular;
	}

}
