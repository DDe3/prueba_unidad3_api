package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPacienteRepository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	private IPacienteRepository pacienteRepository;

	@Override
	public Paciente buscarPacientePorCedula(String cedula) {
		return pacienteRepository.buscarPacientePorCedula(cedula);
	}

	@Override
	public void insertarPaciente(Paciente paciente) {
		/*
		List<CitaMedica> cm = doctor.getCitas();
		cm.forEach(c ->  {
			
		c.setDoctor(doctor);
		c.setFechaCita(LocalDateTime.now());
		c.setPaciente(c.getPaciente());
		
		});
		doctorRepository.insertarDoctor(doctor);
		
		*/
		paciente.setFechaNacimiento(LocalDateTime.now());
		List<CitaMedica> citas = paciente.getCitas();
		citas.forEach(c->{
			c.setPaciente(paciente);
			c.setFechaCita(LocalDateTime.of(2022, 5, 12,0,0));
		});
		pacienteRepository.insertarPaciente(paciente);
	}
	
	
	
	
}
