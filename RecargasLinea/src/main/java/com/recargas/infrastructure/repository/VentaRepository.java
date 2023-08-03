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
	
	@Query(value = "SELECT v.venta_id, v.cantidad, v.operador_operador_id, v.nro_celular, v.persona_persona_id, p.nombre, o.nombre, r.tipo_recarga, r.descripcion, r.valor\n"
			+ "FROM venta v, persona p, operador o, recarga r\n"
			+ "WHERE v.persona_persona_id = p.persona_id\n"
			+ "AND v.operador_operador_id  = o.operador_id\n"
			+ "AND o.recarga_recarga_id  = r.recarga_id\n"
			+ "AND o.operador_id = :operadorId", nativeQuery = true)
	List<VentaEntity> findVentaByOperadorId(@Param("operadorId")int operadorId);
	
	@Query(value = "SELECT v.venta_id, v.cantidad, v.operador_operador_id, v.nro_celular, v.persona_persona_id, p.nombre, o.nombre, r.tipo_recarga, r.descripcion, r.valor\n"
			+ "FROM venta v, persona p, operador o, recarga r\n"
			+ "WHERE v.persona_persona_id = p.persona_id\n"
			+ "AND v.operador_operador_id  = o.operador_id\n"
			+ "AND o.recarga_recarga_id  = r.recarga_id\n"
			+ "AND r.recarga_id = :recargaId", nativeQuery = true)
	List<VentaEntity> findVentaByRecargaId(@Param("recargaId")int recargaId);

}
