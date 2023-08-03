package com.recargas.application.useCase.recarga;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Recarga;
import com.recargas.domain.ports.in.recarga.CreateRecargaIn;
import com.recargas.domain.ports.out.RecargaOut;

@Component
public class CreateRecargaUseCase implements CreateRecargaIn {
	
	private final RecargaOut recargaOut;
	
	public CreateRecargaUseCase(RecargaOut recargaOut) {
		this.recargaOut = recargaOut;
	}
	@Override
	public Recarga createRecarga(Recarga recarga) {
		
		return recargaOut.createRecarga(recarga);
	}

}
