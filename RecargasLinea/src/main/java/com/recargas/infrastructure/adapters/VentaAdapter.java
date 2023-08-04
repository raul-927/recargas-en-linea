package com.recargas.infrastructure.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.recargas.domain.dto.TotalDto;
import com.recargas.domain.models.Operador;
import com.recargas.domain.models.Recarga;
import com.recargas.domain.models.Venta;
import com.recargas.domain.ports.out.VentaOut;
import com.recargas.infrastructure.entitys.VentaEntity;
import com.recargas.infrastructure.repository.VentaRepository;
import com.recargas.infrastructure.rest.mappers.OperadorEntityMapper;
import com.recargas.infrastructure.rest.mappers.RecargaEntityMapper;
import com.recargas.infrastructure.rest.mappers.VentaEntityMapper;

@Component
public class VentaAdapter implements VentaOut {
	
	@Autowired
	private VentaRepository repository;
	
	@Autowired
	private VentaEntityMapper mapper;
	
	@Autowired
	private OperadorEntityMapper operadorMapper;
	
	
	@Autowired
	private RecargaEntityMapper recargaMapper;

	@Override
	public Venta createVenta(Venta venta) {
		VentaEntity ventaResult = repository.save(mapper.toVentaEntity(venta));
		return mapper.toVenta(ventaResult);
	}

	@Override
	public List<Venta> findAllVenta() {
		Iterable<VentaEntity> ventaResult = repository.findAll();
		return (List<Venta>) mapper.toVentas(ventaResult);
	}

	@Override
	public Venta findVentaById(int id) {
		VentaEntity ventaResult  = repository.findVentaByVentaId(id);
		return mapper.toVenta(ventaResult);
	}

	@Override
	public List<Venta> findVentaByOperadorId(Operador operador) {
		List<VentaEntity> ventaResult = repository.findVentaByOperadorId(operador.getOperadorId());
		return (List<Venta>) mapper.toVentas(ventaResult);
	}

	@Override
	public List<Venta> findVentaByRecargaId(Recarga recarga) {
		List<VentaEntity> ventaResult = repository.findVentaByRecargaId(recarga.getRecargaId());
		return (List<Venta>) mapper.toVentas(ventaResult);
	}

	@Override
	public TotalDto totalPorOperador(int operadorId) {
		
		return repository.totalPorOperador(operadorId);
	}

}
