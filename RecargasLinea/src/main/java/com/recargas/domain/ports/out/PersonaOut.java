package com.recargas.domain.ports.out;

import java.util.List;

import com.recargas.domain.models.Persona;

public interface PersonaOut {
	
	Persona createPersona(Persona persona);
	void deletePersona(int id);
	List<Persona> findAllPersonas();
	Persona findPersonaById(int id);
	Persona updatePersona(Persona persona);
}
