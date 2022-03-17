package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Paciente buscarPacientePorCedula(String cedula) {
		TypedQuery<Paciente> mq = em.createQuery("SELECT p FROM Paciente p WHERE cedula=:cedula",Paciente.class);
		mq.setParameter("cedula", cedula);
		return mq.getSingleResult();
	}
	
	
}
