package com.recargas.infrastructure.rest.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.recargas.domain.models.Venta;
import com.recargas.infrastructure.entitys.VentaEntity;

@Mapper(componentModel = "spring")
public interface VentaEntityMapper {
	
	
	
	@Mappings({
		@Mapping(source = "ventaId", 	target = "ventaId"),
        @Mapping(source = "persona", 	target = "persona"),
        @Mapping(source = "operador", 	target = "operador"),
        @Mapping(source = "nroCelular", target = "nroCelular"),
        @Mapping(source = "cantidad", 	target = "cantidad")
		})
	Venta toVenta(VentaEntity ventaEntity);
	
	Iterable<Venta> toVentas(Iterable<VentaEntity> ventasEntity);
	
	@InheritInverseConfiguration
	VentaEntity toVentaEntity(Venta venta);

}
