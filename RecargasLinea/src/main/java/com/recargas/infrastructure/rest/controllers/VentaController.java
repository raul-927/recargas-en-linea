package com.recargas.infrastructure.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recargas.application.services.VentaService;
import com.recargas.domain.models.Operador;
import com.recargas.domain.models.Venta;
import com.recargas.domain.models.Recarga;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	
	@Autowired
	private  VentaService ventaService;
	
	
	@PostMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},
			produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Venta>createVenta(@RequestBody Venta venta){
		HttpHeaders headers = new HttpHeaders();
		Venta venResult = ventaService.createVenta(venta);
		
		return new ResponseEntity<Venta>(venResult, headers, HttpStatus.CREATED);
	}
	
	@GetMapping(produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Venta>>findAllVentas(){
		HttpHeaders headers = new HttpHeaders();
		List<Venta> venResult = ventaService.findAllVenta();
		
		return new ResponseEntity<List<Venta>>(venResult, headers, HttpStatus.CREATED);
	}
	
	
	@GetMapping(value ="/{ventaId}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Venta>findVentaByVentaId(@PathVariable int ventaId){
		HttpHeaders headers = new HttpHeaders();
		Venta  venResult = ventaService.findVentaById(ventaId);
		
		return new ResponseEntity<Venta>(venResult, headers, HttpStatus.CREATED);
	}
	
	@GetMapping(value ="operador/{operadorId}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Venta>>findVentaByOperadorId(@PathVariable int operadorId){
		HttpHeaders headers = new HttpHeaders();
		Operador op = new Operador();
		op.setOperadorId(operadorId);
		List<Venta>  venResult = ventaService.findVentaByOperadorId(op);
		
		return new ResponseEntity<List<Venta>>(venResult, headers, HttpStatus.CREATED);
	}
	
	
	@GetMapping(value ="recarga/{recargaId}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Venta>>findVentaByRecargaId(@PathVariable int recargaId){
		HttpHeaders headers = new HttpHeaders();
		Recarga rec = new Recarga();
		rec.setRecargaId(recargaId);
		List<Venta>  venResult = ventaService.findVentaByRecargaId(rec);
		
		return new ResponseEntity<List<Venta>>(venResult, headers, HttpStatus.CREATED);
	}
	
	

}
