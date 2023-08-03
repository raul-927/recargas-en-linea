package com.recargas.infrastructure.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recargas.application.services.OperadorService;
import com.recargas.domain.models.Operador;

@RestController
@RequestMapping("/operadores")
public class OperadorController {
	
	@Autowired
	private OperadorService operadorService;
	
	
	@PostMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},
				produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Operador> createOperador(@RequestBody Operador operador){
		HttpHeaders headers = new HttpHeaders();
		Operador opResult = operadorService.createOperador(operador);
		
		
		return new ResponseEntity<Operador>(opResult, headers, HttpStatus.CREATED);
	}
	
	@PutMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},
			produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Operador> updateOperador(@RequestBody Operador operador){
		HttpHeaders headers = new HttpHeaders();
		Operador opResult = operadorService.updateOperador(operador);
		
		
		return new ResponseEntity<Operador>(opResult, headers, HttpStatus.OK);
	}
	
	@DeleteMapping("/{operadorId}")
	public ResponseEntity<Operador> deleteOperador(@PathVariable int operadorId){
		HttpHeaders headers = new HttpHeaders();
		operadorService.deleteOperador(operadorId);
		return new ResponseEntity<Operador>(null, headers, HttpStatus.OK);
	}
	
	@GetMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},
			produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Operador>> findAllOperador(){
		HttpHeaders headers = new HttpHeaders();
		List<Operador>opResult = operadorService.findAllOperador();
		
		return new ResponseEntity<List<Operador>>(opResult, headers, HttpStatus.OK);
	}
	
	@GetMapping(value = "/operadorId", produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Operador> findOperadorByOperadorId(@PathVariable int operadorId) {
		HttpHeaders headers = new HttpHeaders();
		Operador opResult = operadorService.findOperadorById(operadorId);
		return new ResponseEntity<Operador>(opResult, headers, HttpStatus.OK);
	}

}
