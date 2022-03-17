package com.example.demo.to;

import java.time.LocalDate;


public class CitaAgendamiento {
	

	private Integer numeroCita;
	private LocalDate fechaCita;
	private Double valorCita;
	private String lugarCita;
	private String cedulaDoctor;
	private String cedulaPaciente;
	
	public CitaAgendamiento() {
		super();
	}
	
	
	public CitaAgendamiento(Integer numeroCita, LocalDate fechaCita, Double valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		super();
		this.numeroCita = numeroCita;
		this.fechaCita = fechaCita;
		this.valorCita = valorCita;
		this.lugarCita = lugarCita;
		this.cedulaDoctor = cedulaDoctor;
		this.cedulaPaciente = cedulaPaciente;
	}
	public Integer getNumeroCita() {
		return numeroCita;
	}
	public void setNumeroCita(Integer numeroCita) {
		this.numeroCita = numeroCita;
	}
	public LocalDate getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDate fechaCita) {
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
	public String getCedulaDoctor() {
		return cedulaDoctor;
	}
	public void setCedulaDoctor(String cedulaDoctor) {
		this.cedulaDoctor = cedulaDoctor;
	}
	public String getCedulaPaciente() {
		return cedulaPaciente;
	}
	public void setCedulaPaciente(String cedulaPaciente) {
		this.cedulaPaciente = cedulaPaciente;
	}
	
	
	

}
