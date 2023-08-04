package com.recargas.domain.ports.in.venta;

import java.util.List;

import com.recargas.domain.dto.TotalDto;
import com.recargas.domain.models.Operador;
import com.recargas.domain.models.Recarga;
import com.recargas.domain.models.Venta;

public interface SelectVentaIn {
	List<Venta> findAllVenta();
	Venta findVentaById(int id);
	List<Venta> findVentaByOperadorId(Operador operador);
	List<Venta> findVentaByRecargaId(Recarga recarga);
	TotalDto totalPorOperador(int operadorId);
	

}
