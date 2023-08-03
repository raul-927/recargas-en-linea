package com.recargas.application.useCase.persona;

import org.springframework.stereotype.Component;

import com.recargas.domain.ports.in.persona.DeletePersonaIn;
import com.recargas.domain.ports.out.PersonaOut;


@Component
public class DeletePersonaUseCase implements DeletePersonaIn{
	
	private final PersonaOut personaOut;
	
	public DeletePersonaUseCase(PersonaOut personaOut) {
		this.personaOut= personaOut;
	}

	@Override
	public void deletePersona(int id) {
		personaOut.deletePersona(id);
		
	}

}
