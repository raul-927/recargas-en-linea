package com.recargas.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recargas.domain.models.Persona;
import com.recargas.domain.ports.in.persona.CreatePersonaIn;
import com.recargas.domain.ports.in.persona.DeletePersonaIn;
import com.recargas.domain.ports.in.persona.SelectPersonaIn;
import com.recargas.domain.ports.in.persona.UpdatePersonaIn;

	


@Service
public class PersonaServiceImpl implements PersonaService{
	
	private final CreatePersonaIn createPersonaIn; 
	private final UpdatePersonaIn updatePersonaIn; 
	private final DeletePersonaIn deletePersonaIn; 
	private final SelectPersonaIn selectPersonaIn;
	
	
	public PersonaServiceImpl(CreatePersonaIn createPersonaIn, UpdatePersonaIn updatePersonaIn, 
			DeletePersonaIn deletePersonaIn,
			SelectPersonaIn selectPersonaIn) {
		this.createPersonaIn = createPersonaIn;
		this.updatePersonaIn = updatePersonaIn;
		this.deletePersonaIn = deletePersonaIn;
		this.selectPersonaIn = selectPersonaIn;
	}

	@Override
	public Persona createPersona(Persona persona) {
		
		return createPersonaIn.createPersona(persona);
	}

	@Override
	public Persona updatePersona(Persona persona) {
		
		return updatePersonaIn.updatePersona(persona);
	}

	@Override
	public void deletePersona(int id) {
		deletePersonaIn.deletePersona(id);
		
	}

	@Override
	public List<Persona> findAllPersonas() {
		
		return selectPersonaIn.findAllPersonas();
	}

	@Override
	public Persona findPersonaById(int id) {
		
		return selectPersonaIn.findPersonaById(id);
	}

}
