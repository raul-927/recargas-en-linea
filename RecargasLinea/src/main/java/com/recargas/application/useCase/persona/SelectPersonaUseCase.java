package com.recargas.application.useCase.persona;

import java.util.List;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Persona;
import com.recargas.domain.ports.in.persona.SelectPersonaIn;
import com.recargas.domain.ports.out.PersonaOut;


@Component
public class SelectPersonaUseCase implements SelectPersonaIn {
	
	private final PersonaOut personaOut;
	
	public SelectPersonaUseCase(PersonaOut personaOut) {
		this.personaOut = personaOut;
	}

	@Override
	public List<Persona> findAllPersonas() {
		
		return personaOut.findAllPersonas();
	}

	@Override
	public Persona findPersonaById(int id) {
		
		return personaOut.findPersonaById(id);
	}

	@Override
	public List<Persona> listPersonasByTipoPersonaEqualsVendedor() {
		
		return personaOut.listPersonasByTipoPersonaEqualsVendedor();
	}

}
