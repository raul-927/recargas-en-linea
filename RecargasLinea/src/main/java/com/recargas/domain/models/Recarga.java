package com.recargas.domain.models;

import java.math.BigDecimal;

import com.recargas.domain.enumerador.TipoRecargaEnum;

public class Recarga {

	private int recargaId;
	private TipoRecargaEnum tipoRecarga;
	private String descripcion;
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
