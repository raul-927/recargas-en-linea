package com.recargas.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recargas.domain.models.Operador;
import com.recargas.domain.models.Recarga;
import com.recargas.domain.models.Venta;
import com.recargas.domain.ports.in.venta.CreateVentaIn;
import com.recargas.domain.ports.in.venta.SelectVentaIn;

@Service
public class VentaServiceImpl implements VentaService {
	
	private final CreateVentaIn createVentaIn; 
	private final SelectVentaIn selectVentaIn;
	
	public VentaServiceImpl(CreateVentaIn createVentaIn, SelectVentaIn selectVentaIn) {
		this.createVentaIn = createVentaIn;
		this.selectVentaIn = selectVentaIn;
	}

	@Override
	public Venta createVenta(Venta venta) {
		
		return createVentaIn.createVenta(venta);
	}

	@Override
	public List<Venta> findAllVenta() {
		
		return selectVentaIn.findAllVenta();
	}

	@Override
	public Venta findVentaById(int id) {
		
		return selectVentaIn.findVentaById(id);
	}

	@Override
	public List<Venta> findVentaByOperadorId(Operador operador) {
		
		return selectVentaIn.findVentaByOperadorId(operador);
	}

	@Override
	public List<Venta> findVentaByRecargaId(Recarga recarga) {
		
		return selectVentaIn.findVentaByRecargaId(recarga);
	}

}
