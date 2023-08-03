package com.recargas.infrastructure.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.recargas.domain.models.Recarga;
import com.recargas.domain.ports.out.RecargaOut;
import com.recargas.infrastructure.entitys.RecargaEntity;
import com.recargas.infrastructure.repository.RecargaRepository;
import com.recargas.infrastructure.rest.mappers.RecargaEntityMapper;


@Component
public class RecargaAdapter implements RecargaOut {
	
	@Autowired
	private RecargaRepository repository;
	
	@Autowired
	private RecargaEntityMapper mapper;

	@Override
	public Recarga createRecarga(Recarga recarga) {
		RecargaEntity recResult = repository.save(mapper.toRecaregaEntity(recarga));
		return mapper.toRecarga(recResult);
	}

	@Override
	public void deleteRecarga(int id) {
	
		repository.deleteById(null);
	}

	@Override
	public List<Recarga> findAllRecargas() {
		Iterable<RecargaEntity> recResult = repository.findAll();
		return (List<Recarga>) mapper.toRecargas(recResult);
	}

	@Override
	public Recarga findRecargaById(int id) {
		RecargaEntity recResult = repository.findRecargaByRecargaId(id);
		
		return mapper.toRecarga(recResult);
	}

	@Override
	public Recarga updateRecarga(Recarga recarga) {
		
		RecargaEntity recResult = repository.save(mapper.toRecaregaEntity(recarga));
		return mapper.toRecarga(recResult);
	}

}
