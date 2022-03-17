package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.service.IDoctorService;

@RestController
@RequestMapping("/ApiDoctores/V1/doctores")
public class DoctorRestController {
	
	@Autowired
	private IDoctorService doctorService;
	

	@GetMapping(path = "/{idDoctor}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Doctor> buscarDoctor(@PathVariable("idDoctor") Integer idDoctor) {
		return ResponseEntity.ok(doctorService.buscarDoctor(idDoctor));
	}
	
	@GetMapping(path = "/cedula/{cedula}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Doctor> buscarDoctorPorCedula(@PathVariable("cedula") String cedula) {
		return ResponseEntity.ok(doctorService.buscarDoctorPorCedula(cedula));
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> insertarDoctor(@RequestBody Doctor doctor) {
		doctorService.insertarDoctor(doctor);
		return ResponseEntity.status(HttpStatus.CREATED).body("Doctor insertado");
	}
	
	@PutMapping(path = "/{idDoctor}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> actualizar(@RequestBody Doctor doctor, @PathVariable("idDoctor") Integer idDoctor) {
		doctor.setId(idDoctor);
		doctorService.actualizarDoctor(doctor);
		return ResponseEntity.ok("Doctor actualizado");
	}
	
	@DeleteMapping(path = "/{idDoctor}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> borrarDoctor(@PathVariable("idDoctor") Integer idDoctor) {
		this.doctorService.borrarDoctor(idDoctor);
		return ResponseEntity.ok("Doctor eliminado");
	} 
	
	
	
}
