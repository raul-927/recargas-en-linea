package com.recargas.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recargas.domain.models.Operador;
import com.recargas.domain.ports.in.operador.CreateOperadorIn;
import com.recargas.domain.ports.in.operador.DeleteOperadorIn;
import com.recargas.domain.ports.in.operador.SelectOperadorIn;
import com.recargas.domain.ports.in.operador.UpdateOperadorIn;


@Service
public class OperadorServiceImpl implements OperadorService {
	private final CreateOperadorIn createOperadorIn;
	private final DeleteOperadorIn deleteOperadorIn;
	private final UpdateOperadorIn updateOperadorIn; 
	private final SelectOperadorIn selectOperadorIn;
	
	public OperadorServiceImpl(CreateOperadorIn createOperadorIn, 
			DeleteOperadorIn deleteOperadorIn, 
			UpdateOperadorIn updateOperadorIn, SelectOperadorIn selectOperadorIn) {
		this.createOperadorIn= createOperadorIn;
		this.deleteOperadorIn = deleteOperadorIn;
		this.updateOperadorIn = updateOperadorIn;
		this.selectOperadorIn = selectOperadorIn;
		
	}

	@Override
	public Operador createOperador(Operador operador) {
		
		return createOperadorIn.createOperador(operador);
	}

	@Override
	public void deleteOperador(int id) {
		deleteOperadorIn.deleteOperador(id);

	}

	@Override
	public Operador updateOperador(Operador operador) {
		
		return updateOperadorIn.updateOperador(operador);
	}

	@Override
	public List<Operador> findAllOperador() {
		
		return selectOperadorIn.findAllOperador();
	}

	@Override
	public Operador findOperadorById(int id) {
		
		return selectOperadorIn.findOperadorById(id);
	}

}
