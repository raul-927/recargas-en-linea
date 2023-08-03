package com.recargas.application.useCase.persona;

import org.springframework.stereotype.Component;

import com.recargas.domain.models.Persona;
import com.recargas.domain.ports.in.persona.CreatePersonaIn;
import com.recargas.domain.ports.out.PersonaOut;



@Component
public class CreatePersonaUseCase implements CreatePersonaIn{
	
	private final PersonaOut personaOut;
	
	public CreatePersonaUseCase(PersonaOut personaOut) {
		this.personaOut = personaOut;
	}
	@Override
	public Persona createPersona(Persona persona) {
		return personaOut.createPersona(persona);
	}

}
