package com.recargas.application.useCase.operador;

import org.springframework.stereotype.Component;

import com.recargas.domain.ports.in.operador.DeleteOperadorIn;
import com.recargas.domain.ports.out.OperadorOut;


@Component
public class DeleteOperadorUseCase implements DeleteOperadorIn {
	
	
	private final OperadorOut operadorOut;
	
	
	public DeleteOperadorUseCase(OperadorOut operadorOut) {
		this.operadorOut = operadorOut;
	}


	@Override
	public void deleteOperador(int id) {
		this.operadorOut.deleteOperador(id);
		
	}

	

}
