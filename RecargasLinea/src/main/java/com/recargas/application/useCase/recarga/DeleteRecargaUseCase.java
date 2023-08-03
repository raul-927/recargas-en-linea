package com.recargas.application.useCase.recarga;

import org.springframework.stereotype.Component;

import com.recargas.domain.ports.in.recarga.DeleteRecargaIn;
import com.recargas.domain.ports.out.RecargaOut;


@Component
public class DeleteRecargaUseCase implements DeleteRecargaIn {
	
	private final RecargaOut recargaOut;
	
	public DeleteRecargaUseCase(RecargaOut recargaOut) {
		this.recargaOut = recargaOut;
	}

	@Override
	public void deleteRecarga(int id) {
		recargaOut.deleteRecarga(id);
		
	}

}
