package com.recargas.infrastructure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.recargas.infrastructure.entitys.OperadorEntity;
import com.recargas.infrastructure.entitys.RecargaEntity;
import com.recargas.infrastructure.entitys.VentaEntity;

public interface VentaRepository extends CrudRepository<VentaEntity, Integer> {
	
	VentaEntity findVentaByVentaId(int ventaId);
	
	@Query(value = "SELECT v.venta_id, v.recarga_recarga_id, v.operador_operador_id, v.nro_celular, v.persona_persona_id, p.nombre, o.nombre, r.tipo_recarga, r.descripcion, r.valor \n"
			+ "FROM venta v, persona p, operador o, recarga r, operador_recargas or2\n"
			+ "WHERE v.persona_persona_id = p.persona_id\n"
			+ "AND p.tipo_persona = 'VENDEDOR'\n"
			+ "AND v.operador_operador_id  = or2.operador_entity_operador_id\n"
			+ "AND o.operador_id  = or2.operador_entity_operador_id\n"
			+ "AND r.recarga_id  = v.recarga_recarga_id \n"
			+ "AND o.operador_id = :operadorId \n"
			+ "GROUP BY v.venta_id ", nativeQuery = true)
	List<VentaEntity> findVentaByOperadorId(@Param("operadorId")int operadorId);
	
	@Query(value = "SELECT v.venta_id, v.recarga_recarga_id, v.operador_operador_id, v.nro_celular, v.persona_persona_id, p.nombre, o.nombre, r.tipo_recarga, r.descripcion, r.valor\n"
			+ "FROM venta v, persona p, operador o, recarga r, operador_recargas or2\n"
			+ "WHERE v.persona_persona_id = p.persona_id\n"
			+ "AND p.tipo_persona = 'VENDEDOR'\n"
			+ "AND v.operador_operador_id  = or2.operador_entity_operador_id\n"
			+ "AND r.recarga_id  = or2.recargas_recarga_id \n"
			+ "AND r.recarga_id = :recargaId", nativeQuery = true)
	List<VentaEntity> findVentaByRecargaId(@Param("recargaId")int recargaId);

}
