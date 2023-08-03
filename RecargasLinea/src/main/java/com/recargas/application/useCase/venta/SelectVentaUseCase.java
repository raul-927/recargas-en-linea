package com.recargas.application.useCase.venta;

import java.util.List;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Operador;
import com.recargas.domain.models.Recarga;
import com.recargas.domain.models.Venta;
import com.recargas.domain.ports.in.venta.SelectVentaIn;
import com.recargas.domain.ports.out.VentaOut;


@Component
public class SelectVentaUseCase implements SelectVentaIn {
	
	private final VentaOut ventaOut;
	public SelectVentaUseCase(VentaOut ventaOut) {
		this.ventaOut  = ventaOut;
	}

	@Override
	public List<Venta> findAllVenta() {
		
		return ventaOut.findAllVenta();
	}

	@Override
	public Venta findVentaById(int id) {
		
		return ventaOut.findVentaById(id);
	}

	@Override
	public List<Venta> findVentaByOperadorId(Operador operador) {
		
		return ventaOut.findVentaByOperadorId(operador);
	}

	@Override
	public List<Venta> findVentaByRecargaId(Recarga recarga) {
		
		return ventaOut.findVentaByRecargaId(recarga);
	}

}
