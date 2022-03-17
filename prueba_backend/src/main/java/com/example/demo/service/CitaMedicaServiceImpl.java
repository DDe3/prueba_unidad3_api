package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaMedicaRepository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.to.ActualizarCita;
import com.example.demo.to.CitaAgendamiento;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	
	@Autowired
	private ICitaMedicaRepository citaRepository;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Override
	public void agendarCita(CitaAgendamiento citaAgendamiento) {
		CitaMedica cm = new CitaMedica();
		cm.setNumeroCita(citaAgendamiento.getNumeroCita());
		cm.setFechaCita(LocalDateTime.now());
		cm.setValorCita(citaAgendamiento.getValorCita());
		cm.setLugarCita(citaAgendamiento.getLugarCita());
		cm.setDoctor( doctorService.buscarDoctorPorCedula(citaAgendamiento.getCedulaDoctor()));
		cm.setPaciente( pacienteService.buscarPacientePorCedula(citaAgendamiento.getCedulaPaciente()) );
		citaRepository.insertarCita(cm);
	}

	@Override
	public void actualizarCita(ActualizarCita actualizarCita, Integer numeroCita) {
		CitaMedica cita = citaRepository.buscarCitaPorNumero(numeroCita);
		cita.setDiagnostico(actualizarCita.getDiagnostico());
		cita.setReceta(actualizarCita.getReceta());
		cita.setFechaCita(LocalDateTime.now());
		citaRepository.actualizarCita(cita);
		
	}

	@Override
	public List<CitaMedica> consultarCitasPendientes(String cedulaDoctor) {
		 Doctor doctor = doctorService.buscarDoctorPorCedula(cedulaDoctor);
		 List<CitaMedica> citas = citaRepository.consultarCitasPendientes(doctor.getId());
		 List<CitaMedica> citasPendientes = new ArrayList<>();
		 citas.forEach( cita -> {
			 if (cita.getDiagnostico()==null || cita.getReceta()==null || cita.getProximaCita()==null) {
				 citasPendientes.add(cita);
			 }
		 });
		 return citasPendientes;
	}
	
	

}
