package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteService {
	
	Paciente buscarPacientePorCedula(String cedula);
	void insertarPaciente(Paciente paciente);
	
}
