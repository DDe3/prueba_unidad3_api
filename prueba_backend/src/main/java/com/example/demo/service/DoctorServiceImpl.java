package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDoctorRespository;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRespository doctorRepository;

	@Override
	public void insertarDoctor(Doctor doctor) {
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
