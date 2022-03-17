package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteRepository {
	
	Paciente buscarPacientePorCedula(String cedula);

}
