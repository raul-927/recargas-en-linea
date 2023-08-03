package com.recargas.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recargas.domain.models.Recarga;
import com.recargas.domain.ports.in.recarga.CreateRecargaIn;
import com.recargas.domain.ports.in.recarga.DeleteRecargaIn;
import com.recargas.domain.ports.in.recarga.SelectRecargaIn;
import com.recargas.domain.ports.in.recarga.UpdateRecargaIn;

@Service
public class RecargaServiceImpl implements RecargaService {
	
	
	private final CreateRecargaIn createRecargaIn; 
	private final UpdateRecargaIn updateRecargaIn; 
	private final DeleteRecargaIn deleteRecargaIn; 
	private final SelectRecargaIn selectRecargaIn;
	
	
	public RecargaServiceImpl(CreateRecargaIn createRecargaIn, UpdateRecargaIn updateRecargaIn, 
			DeleteRecargaIn deleteRecargaIn, SelectRecargaIn selectRecargaIn) {
		this.createRecargaIn = createRecargaIn;
		this.updateRecargaIn = updateRecargaIn;
		this.deleteRecargaIn = deleteRecargaIn;
		this.selectRecargaIn = selectRecargaIn;
	}
	
	
	@Override
	public Recarga createRecarga(Recarga recarga) {
		
		return createRecargaIn.createRecarga(recarga);
	}

	@Override
	public Recarga updateRecarga(Recarga recarga) {
		
		return updateRecargaIn.updateRecarga(recarga);
	}

	@Override
	public void deleteRecarga(int id) {
		deleteRecargaIn.deleteRecarga(id);

	}

	@Override
	public List<Recarga> findAllRecargas() {
		
		return selectRecargaIn.findAllRecargas();
	}

	@Override
	public Recarga findRecargaById(int id) {
		
		return selectRecargaIn.findRecargaById(id);
	}

}
