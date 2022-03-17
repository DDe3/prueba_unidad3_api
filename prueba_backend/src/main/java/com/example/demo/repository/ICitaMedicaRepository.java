package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	
	void insertarCita(CitaMedica cita);
	CitaMedica buscarCitaPorNumero(Integer numero);
	void actualizarCita(CitaMedica cita);
	List<CitaMedica> consultarCitasPendientes(Integer idDoctor);
	CitaMedica buscarCitaProxima(Integer pacienteId);

}
