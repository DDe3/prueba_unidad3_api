package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void insertarCita(CitaMedica cita) {
		em.persist(cita);
	}


	@Override
	public CitaMedica buscarCitaPorNumero(Integer numero) {
		TypedQuery<CitaMedica> mq = em.createQuery("SELECT c FROM CitaMedica c WHERE numeroCita=:numero", CitaMedica.class);
		mq.setParameter("numero", numero);
		return mq.getSingleResult();
	}


	@Override
	public void actualizarCita(CitaMedica cita) {
		em.merge(cita);
	}


	@Override
	public List<CitaMedica> consultarCitasPendientes(Integer idDoctor) {
		TypedQuery<CitaMedica> mq = em.createQuery("SELECT c FROM CitaMedica c WHERE doctor.id=:idDoctor", CitaMedica.class);
		mq.setParameter("idDoctor", idDoctor);
		return mq.getResultList();
	}


	@Override
	public CitaMedica buscarCitaProxima(Integer pacienteId) {
		TypedQuery<CitaMedica> mq = em.createQuery("SELECT c FROM CitaMedica c WHERE paciente.id = :pacienteId ORDER BY c.proximaCita", CitaMedica.class);
		mq.setParameter("pacienteId", pacienteId);
		List<CitaMedica> citas = mq.getResultList();
		return citas.get(0);
	}

}
