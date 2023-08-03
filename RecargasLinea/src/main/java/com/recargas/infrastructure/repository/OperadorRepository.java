package com.recargas.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;

import com.recargas.infrastructure.entitys.OperadorEntity;

public interface OperadorRepository extends CrudRepository<OperadorEntity, Integer> {
	
	OperadorEntity findOperadorByOperadorId(int operadorId);

}
