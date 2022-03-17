package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.to.ActualizarCita;
import com.example.demo.to.CitaAgendamiento;

public interface ICitaMedicaService {
	
	void agendarCita(CitaAgendamiento citaAgendamiento);
	void actualizarCita(ActualizarCita actualizarCita, Integer numeroCita);
	List<CitaMedica> consultarCitasPendientes(String cedulaDoctor);
	CitaMedica consultarCitaProxima(String cedula);
}
