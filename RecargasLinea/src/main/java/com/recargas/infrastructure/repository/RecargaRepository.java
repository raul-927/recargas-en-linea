package com.recargas.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;

import com.recargas.infrastructure.entitys.RecargaEntity;

public interface RecargaRepository extends CrudRepository<RecargaEntity, Integer> {
	
	RecargaEntity findRecargaByRecargaId(int recargaId);

}
