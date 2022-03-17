package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPacienteRepository;
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
		pacienteRepository.insertarPaciente(paciente);
	}
	
	
	
	
}
