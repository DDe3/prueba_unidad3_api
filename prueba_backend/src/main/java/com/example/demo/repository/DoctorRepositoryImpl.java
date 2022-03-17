package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;


@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRespository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertarDoctor(Doctor doctor) {
		em.persist(doctor);
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		return em.find(Doctor.class, id);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		em.merge(doctor);
	}

	@Override
	public void borrarDoctor(Integer id) {
		Doctor doctor = buscarDoctor(id);
		em.remove(doctor);
	}

	@Override
	public Doctor buscarDoctorPorCedula(String cedula) {
		TypedQuery<Doctor> mq = em.createQuery("SELECT d FROM Doctor d WHERE cedula=:cedula",Doctor.class);
		mq.setParameter("cedula", cedula);
		return mq.getSingleResult();
	}
	
	
	
}
