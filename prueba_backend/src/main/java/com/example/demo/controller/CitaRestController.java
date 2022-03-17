package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.service.ICitaMedicaService;

@RestController
@RequestMapping("/ApiCitas/V1/citas")
public class CitaRestController {
	
	
	@Autowired
	private ICitaMedicaService citaService;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(path = "/{cedula}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CitaMedica>> getCitasPendientes(@PathVariable("cedula") String cedula) {
		return ResponseEntity.ok(citaService.consultarCitasPendientes(cedula));
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(path = "/{cedula}/proxima-cita", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CitaMedica> getCitaProxima(@PathVariable("cedula") String cedula) {
		return ResponseEntity.ok(citaService.consultarCitaProxima(cedula));
		
	}
	
	

}
