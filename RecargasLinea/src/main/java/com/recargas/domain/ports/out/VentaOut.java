package com.recargas.domain.ports.out;

import java.util.List;

import com.recargas.domain.dto.TotalDto;
import com.recargas.domain.models.Operador;
import com.recargas.domain.models.Recarga;
import com.recargas.domain.models.Venta;

public interface VentaOut {
	Venta createVenta(Venta venta);
	List<Venta> findAllVenta();
	Venta findVentaById(int id);
	List<Venta> findVentaByOperadorId(Operador operador);
	List<Venta> findVentaByRecargaId(Recarga recarga);
	TotalDto totalPorOperador(int operadorId);
}
