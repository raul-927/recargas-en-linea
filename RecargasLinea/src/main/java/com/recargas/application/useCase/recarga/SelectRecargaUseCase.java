package com.recargas.application.useCase.recarga;

import java.util.List;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Recarga;
import com.recargas.domain.ports.in.recarga.SelectRecargaIn;
import com.recargas.domain.ports.out.RecargaOut;


@Component
public class SelectRecargaUseCase implements SelectRecargaIn {
	
	private RecargaOut recargaOut;
	
	public SelectRecargaUseCase(RecargaOut recargaOut) {
		this.recargaOut = recargaOut;
	}

	@Override
	public List<Recarga> findAllRecargas() {
		
		return recargaOut.findAllRecargas();
	}

	@Override
	public Recarga findRecargaById(int id) {
		
		return recargaOut.findRecargaById(id);
	}

}
