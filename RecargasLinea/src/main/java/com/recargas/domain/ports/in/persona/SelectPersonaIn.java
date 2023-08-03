package com.recargas.domain.ports.in.persona;

import java.util.List;

import com.recargas.domain.models.Persona;

public interface SelectPersonaIn {
	List<Persona> findAllPersonas();
	Persona findPersonaById(int id);

}
