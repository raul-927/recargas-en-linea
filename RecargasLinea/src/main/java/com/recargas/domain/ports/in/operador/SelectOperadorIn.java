package com.recargas.domain.ports.in.operador;

import java.util.List;

import com.recargas.domain.models.Operador;

public interface SelectOperadorIn {
	List<Operador> findAllOperador();
	Operador findOperadorById(int id);
	
}
