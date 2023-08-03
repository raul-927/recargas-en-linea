package com.recargas.infrastructure.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.recargas.domain.models.Operador;
import com.recargas.domain.ports.out.OperadorOut;
import com.recargas.infrastructure.entitys.OperadorEntity;
import com.recargas.infrastructure.repository.OperadorRepository;
import com.recargas.infrastructure.rest.mappers.OperadorEntityMapper;


@Component
public class OperadorAdapter implements OperadorOut {
	
	
	@Autowired
	private OperadorRepository repository;
	
	
	@Autowired
	private OperadorEntityMapper mapper;

	@Override
	public Operador createOperador(Operador operador) {
		
		OperadorEntity opEntity= repository.save(mapper.toOperadorEntity(operador));
		
		return mapper.toOperador(opEntity);
	}

	@Override
	public void deleteOperador(int id) {
		
		repository.deleteById(id);
	}

	@Override
	public List<Operador> findAllOperador() {
		List<OperadorEntity> opResult = (List<OperadorEntity>) repository.findAll();
		
		return (List<Operador>) mapper.toOperadores(opResult);
	}

	@Override
	public Operador findOperadorById(int id) {
		OperadorEntity opResult = repository.findOperadorByOperadorId(id);
		return mapper.toOperador(opResult);
	}

	@Override
	public Operador updateOperador(Operador operador) {
		OperadorEntity opResult = repository.save(mapper.toOperadorEntity(operador));
		
		return  mapper.toOperador(opResult);
	}

}
