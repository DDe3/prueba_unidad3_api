package com.example.demo.repository.modelo;


import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cita_medica")
public class CitaMedica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cita_medica")
	@SequenceGenerator(name = "seq_cita_medica", sequenceName = "seq_cita_medica", allocationSize = 1)
	@Column(name="cime_id")
	private Integer id;
	
	@Column(name="cime_numero_cita")
	private Integer numeroCita;
	@Column(name="cime_fecha_cita")
	private LocalDateTime fechaCita;
	@Column(name="cime_valor_cita")
	private Double valorCita;
	@Column(name="cime_lugar_cita")
	private String lugarCita;
	@Column(name="cime_diagnostico")
	private String diagnostico;
	@Column(name="cime_receta")
	private String receta;
	@Column(name="cime_fecha_proxima_cita")
	private LocalDateTime proximaCita;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doct_id")
	private Doctor doctor;
	
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paci_id")
	private Paciente paciente;
	
	
	public CitaMedica() {
		super();
	}
	public CitaMedica(Integer id, Integer numeroCita, LocalDateTime fechaCita, Double valorCita, String lugarCita,
			String diagnostico, String receta, LocalDateTime proximaCita) {
		super();
		this.id = id;
		this.numeroCita = numeroCita;
		this.fechaCita = fechaCita;
		this.valorCita = valorCita;
		this.lugarCita = lugarCita;
		this.diagnostico = diagnostico;
		this.receta = receta;
		this.proximaCita = proximaCita;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroCita() {
		return numeroCita;
	}
	public void setNumeroCita(Integer numeroCita) {
		this.numeroCita = numeroCita;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public Double getValorCita() {
		return valorCita;
	}
	public void setValorCita(Double valorCita) {
		this.valorCita = valorCita;
	}
	public String getLugarCita() {
		return lugarCita;
	}
	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDateTime getProximaCita() {
		return proximaCita;
	}
	public void setProximaCita(LocalDateTime proximaCita) {
		this.proximaCita = proximaCita;
	}
	
	
	
	
	

}
