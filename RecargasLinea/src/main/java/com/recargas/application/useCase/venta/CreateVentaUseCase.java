package com.recargas.application.useCase.venta;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Venta;
import com.recargas.domain.ports.in.venta.CreateVentaIn;
import com.recargas.domain.ports.out.VentaOut;


@Component
public class CreateVentaUseCase implements CreateVentaIn {
	
	private final VentaOut ventaOut;
	public CreateVentaUseCase(VentaOut ventaOut) {
		this.ventaOut = ventaOut;
	}

	@Override
	public Venta createVenta(Venta venta) {
		
		return ventaOut.createVenta(venta);
	}

}
