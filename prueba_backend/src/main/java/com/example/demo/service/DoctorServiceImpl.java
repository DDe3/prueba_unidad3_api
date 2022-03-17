package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDoctorRespository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

@Service
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRespository doctorRepository;
	


	@Override
	public void insertarDoctor(Doctor doctor) {
		List<CitaMedica> cm = doctor.getCitas();
		cm.forEach(c ->  {
			
		c.setDoctor(doctor);
		c.setFechaCita(LocalDateTime.now());
		c.setPaciente(c.getPaciente());
		
		});
		doctorRepository.insertarDoctor(doctor);
		
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		return doctorRepository.buscarDoctor(id);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		doctorRepository.actualizarDoctor(doctor);
	}

	@Override
	public void borrarDoctor(Integer id) {
		doctorRepository.borrarDoctor(id);
	}

	@Override
	public Doctor buscarDoctorPorCedula(String cedula) {
		return doctorRepository.buscarDoctorPorCedula(cedula);
	}
	
	

}
