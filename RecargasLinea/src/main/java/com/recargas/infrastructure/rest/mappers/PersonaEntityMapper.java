package com.recargas.infrastructure.rest.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.recargas.domain.models.Persona;
import com.recargas.infrastructure.entitys.PersonaEntity;

@Mapper(componentModel = "spring")
public interface PersonaEntityMapper {
	
	@Mappings({
		@Mapping(source = "personaId", 	target = "personaId"),
        @Mapping(source = "nombre", 	target = "nombre"),
        @Mapping(source = "documento", 	target = "documento")
		})
	Persona toPersona(PersonaEntity personaEntity);
	
	Iterable<Persona> toPersonas(Iterable<PersonaEntity> personasEntity);
	
	@InheritInverseConfiguration
	PersonaEntity toPersonaEntity(Persona persona);

}
