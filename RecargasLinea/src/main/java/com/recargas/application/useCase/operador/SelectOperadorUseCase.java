package com.recargas.application.useCase.operador;

import java.util.List;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Operador;
import com.recargas.domain.ports.in.operador.SelectOperadorIn;
import com.recargas.domain.ports.out.OperadorOut;


@Component
public class SelectOperadorUseCase implements SelectOperadorIn {
	
	private final OperadorOut operadorOut;
	
	
	public SelectOperadorUseCase(OperadorOut operadorOut) {
		this.operadorOut = operadorOut;
	}

	@Override
	public List<Operador> findAllOperador() {
		
		return operadorOut.findAllOperador();
	}

	@Override
	public Operador findOperadorById(int id) {
		
		return operadorOut.findOperadorById(id);
	}

}
