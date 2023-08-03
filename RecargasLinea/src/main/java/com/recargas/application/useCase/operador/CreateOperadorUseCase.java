package com.recargas.application.useCase.operador;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Operador;
import com.recargas.domain.ports.in.operador.CreateOperadorIn;
import com.recargas.domain.ports.out.OperadorOut;


@Component
public class CreateOperadorUseCase implements CreateOperadorIn {
	
	private final OperadorOut operadorOut;
	
	public CreateOperadorUseCase(OperadorOut operadorOut) {
		this.operadorOut = operadorOut;
	}
	
	@Override
	public Operador createOperador(Operador operador) {
		
		return operadorOut.createOperador(operador);
	}

}
