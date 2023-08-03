package com.recargas.infrastructure.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recargas.application.services.PersonaService;
import com.recargas.domain.models.Persona;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@PostMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},
			produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Persona> createPersona(@RequestBody Persona persona){
		HttpHeaders headers = new HttpHeaders();
		Persona pResult = personaService.createPersona(persona);
		return new ResponseEntity<Persona>(pResult, headers, HttpStatus.CREATED);
	}
	
	@PutMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},
			produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona){
		HttpHeaders headers = new HttpHeaders();
		Persona pResult = personaService.updatePersona(persona);
		return new ResponseEntity<Persona>(pResult, headers, HttpStatus.CREATED);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deletePersona(@PathVariable int personaId){
		HttpHeaders headers = new HttpHeaders();
		personaService.deletePersona(personaId);
		
		return new ResponseEntity<Persona>(null, headers, HttpStatus.OK);
	}
	
	@GetMapping(produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Persona>> findAllPersonas(){
		HttpHeaders headers = new HttpHeaders();
		List<Persona> pResut = personaService.findAllPersonas();
		
		return new ResponseEntity<List<Persona>>(pResut, headers, HttpStatus.OK);
	}
	
	@GetMapping(value ="/{personaId}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Persona> findPersonaByPersonaId(@PathVariable int personaId){
		HttpHeaders headers = new HttpHeaders();
		Persona pResult = personaService.findPersonaById(personaId);
		
		return new ResponseEntity<Persona>(pResult, headers, HttpStatus.OK);
	}

}
