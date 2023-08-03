package com.recargas.application.useCase.persona;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Persona;
import com.recargas.domain.ports.in.persona.UpdatePersonaIn;
import com.recargas.domain.ports.out.PersonaOut;


@Component
public class UpdatePersonaUseCase implements UpdatePersonaIn {
	
	
	private final PersonaOut personaOut;
	
	public UpdatePersonaUseCase(PersonaOut personaOut) {
		this.personaOut = personaOut;
	}

	@Override
	public Persona updatePersona(Persona persona) {
		
		return personaOut.updatePersona(persona);
	}

}
