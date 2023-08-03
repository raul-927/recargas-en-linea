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

import com.recargas.application.services.RecargaService;
import com.recargas.domain.models.Recarga;

@RestController
@RequestMapping("/recargas")
public class RecargaController {
	
	@Autowired
	private RecargaService recargaService;
	
	@PostMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},
			produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Recarga> createRecarga(@RequestBody Recarga recarga){
		HttpHeaders headers = new HttpHeaders();
		Recarga recResult = recargaService.createRecarga(recarga);
		
		return new ResponseEntity<Recarga>(recResult, headers, HttpStatus.CREATED);
	}
	
	@PutMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},
			produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Recarga> updateRecarga(@RequestBody Recarga recarga){
		HttpHeaders headers = new HttpHeaders();
		Recarga recResult = recargaService.updateRecarga(recarga);
		
		return new ResponseEntity<Recarga>(recResult, headers, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/{recargaId}")
	public ResponseEntity<Recarga> deleteRecarga(@PathVariable int recargaId){
		HttpHeaders headers = new HttpHeaders();
		recargaService.deleteRecarga(recargaId);
		
		return new ResponseEntity<Recarga>(null, headers, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Recarga>> findAllRecarga(){
		HttpHeaders headers = new HttpHeaders();
		List<Recarga>recResult = recargaService.findAllRecargas();
		
		return new ResponseEntity<List<Recarga>>(recResult, headers, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/{recargaId}")
	public ResponseEntity<Recarga> findRecargaById(@PathVariable int recargaId){
		HttpHeaders headers = new HttpHeaders();
		Recarga recResult = recargaService.findRecargaById(recargaId);
		
		return new ResponseEntity<Recarga>(recResult, headers, HttpStatus.CREATED);
	}

}
