package com.recargas.domain.ports.out;

import java.util.List;

import com.recargas.domain.models.Operador;

public interface OperadorOut {
	Operador createOperador(Operador operador);
	void deleteOperador(int id);
	List<Operador> findAllOperador();
	Operador findOperadorById(int id);
	Operador updateOperador(Operador operador);
}
