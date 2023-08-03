package com.recargas.infrastructure.rest.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.recargas.domain.models.Recarga;
import com.recargas.infrastructure.entitys.RecargaEntity;

@Mapper(componentModel = "spring")
public interface RecargaEntityMapper {
	
	@Mappings({
		@Mapping(source = "recargaId", 		target = "recargaId"),
        @Mapping(source = "tipoRecarga", 	target = "tipoRecarga"),
        @Mapping(source = "descripcion", 	target = "descripcion"),
        @Mapping(source = "valor", 			target = "valor")
		})
	Recarga toRecarga(RecargaEntity recargaEntity);
	
	Iterable<Recarga> toRecargas(Iterable<RecargaEntity> recargasEntity);
	
	@InheritInverseConfiguration
	RecargaEntity toRecaregaEntity(Recarga recarga);
}
