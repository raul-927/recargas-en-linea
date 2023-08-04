package com.recargas.infrastructure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.recargas.infrastructure.entitys.PersonaEntity;

public interface PersonaRepository extends CrudRepository<PersonaEntity, Integer>{
	
	PersonaEntity findPersonaByPersonaId(int personaId);
	
	
	
	@Query(value = "SELECT p.persona_id, p.nombre, p.documento, p.tipo_persona "
			+ "from persona p "
			+ "WHERE p.tipo_persona = 'VENDEDOR'", nativeQuery = true)
	List<PersonaEntity> listPersonasByTipoPersonaEqualsVendedor();

}
