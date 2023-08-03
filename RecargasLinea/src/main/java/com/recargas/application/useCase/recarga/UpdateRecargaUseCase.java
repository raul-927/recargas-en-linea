package com.recargas.application.useCase.recarga;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Recarga;
import com.recargas.domain.ports.in.recarga.UpdateRecargaIn;
import com.recargas.domain.ports.out.RecargaOut;


@Component
public class UpdateRecargaUseCase implements UpdateRecargaIn {
	
	private final RecargaOut recargaOut;
	
	public UpdateRecargaUseCase(RecargaOut recargaOut){
		this.recargaOut = recargaOut;
	}
	

	@Override
	public Recarga updateRecarga(Recarga recarga) {
		
		return recargaOut.updateRecarga(recarga);
	}

}
