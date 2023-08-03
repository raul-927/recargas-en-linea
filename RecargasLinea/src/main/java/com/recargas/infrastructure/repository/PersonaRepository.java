package com.recargas.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;

import com.recargas.infrastructure.entitys.PersonaEntity;

public interface PersonaRepository extends CrudRepository<PersonaEntity, Integer>{
	
	PersonaEntity findPersonaByPersonaId(int personaId);

}
