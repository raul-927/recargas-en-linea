package com.recargas.infrastructure.rest.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.recargas.domain.models.Operador;
import com.recargas.infrastructure.entitys.OperadorEntity;

@Mapper(componentModel = "spring")
public interface OperadorEntityMapper {
	
	
	@Mappings({
		@Mapping(source = "operadorId", target = "operadorId"),
        @Mapping(source = "nombre", 	target = "nombre"),
        @Mapping(source = "recarga", 	target = "recarga")
		})
	Operador toOperador(OperadorEntity operadorEntity);
	
	Iterable<Operador> toOperadores(Iterable<OperadorEntity> operadoresEntity);
	
	@InheritInverseConfiguration
	OperadorEntity toOperadorEntity(Operador operador);
	
	
}


