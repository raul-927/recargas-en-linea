package com.recargas.infrastructure.entitys;

import java.io.Serializable;
import java.math.BigDecimal;

import com.recargas.domain.enumerador.TipoRecargaEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recarga")
public class RecargaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recarga_id")
	private int recargaId;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_recarga")
	private TipoRecargaEnum tipoRecarga;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	
	
	public TipoRecargaEnum getTipoRecarga() {
		return tipoRecarga;
	}
	public void setTipoRecarga(TipoRecargaEnum tipoRecarga) {
		this.tipoRecarga = tipoRecarga;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public int getRecargaId() {
		return recargaId;
	}
	public void setRecargaId(int recargaId) {
		this.recargaId = recargaId;
	}
	

}
