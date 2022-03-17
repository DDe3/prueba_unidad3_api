package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorRespository {
	
	void insertarDoctor(Doctor doctor);
	Doctor buscarDoctor(Integer id);
	void actualizarDoctor(Doctor doctor);
	void borrarDoctor(Integer id);
	Doctor buscarDoctorPorCedula(String cedula);

}
