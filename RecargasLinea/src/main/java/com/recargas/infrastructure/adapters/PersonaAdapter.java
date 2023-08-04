package com.recargas.infrastructure.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.recargas.domain.models.Persona;
import com.recargas.domain.ports.out.PersonaOut;
import com.recargas.infrastructure.entitys.PersonaEntity;
import com.recargas.infrastructure.repository.PersonaRepository;
import com.recargas.infrastructure.rest.mappers.PersonaEntityMapper;

@Component
public class PersonaAdapter implements PersonaOut {
	
	
	@Autowired
	private PersonaRepository repository;
	
	@Autowired
	private PersonaEntityMapper mapper;

	@Override
	public Persona createPersona(Persona persona) {
		PersonaEntity perResult = repository.save(mapper.toPersonaEntity(persona));
		return mapper.toPersona(perResult);
	}

	@Override
	public void deletePersona(int id) {
		repository.deleteById(null);

	}

	@Override
	public List<Persona> findAllPersonas() {
		Iterable<PersonaEntity> persResult = repository.findAll();
		
		return  (List<Persona>) mapper.toPersonas(persResult);
	}

	@Override
	public Persona findPersonaById(int id) {
		PersonaEntity perResult = repository.findPersonaByPersonaId(id);
		return mapper.toPersona(perResult);
	}

	@Override
	public Persona updatePersona(Persona persona) {
		
		PersonaEntity perResult = repository.save(mapper.toPersonaEntity(persona));
		return mapper.toPersona(perResult);
	}

	@Override
	public List<Persona> listPersonasByTipoPersonaEqualsVendedor() {
		List<PersonaEntity> pResult = repository.listPersonasByTipoPersonaEqualsVendedor();
		return (List<Persona>) mapper.toPersonas(pResult);
	}

}
