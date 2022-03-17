package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.IPacienteService;

@RestController
@RequestMapping("/ApiPacientes/V1/pacientes")
public class PacienteRestController {
	
	@Autowired
	private IPacienteService pacienteService;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(path="/cedula/{cedula}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Paciente> buscarPacientePorCedula(@PathVariable("cedula") String cedula) {
		return ResponseEntity.ok(pacienteService.buscarPacientePorCedula(cedula));
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> insertarPaciente(@RequestBody Paciente paciente) {
		pacienteService.insertarPaciente(paciente);
		return ResponseEntity.status(HttpStatus.CREATED).body("Paciente insertado");
	}
	

}
