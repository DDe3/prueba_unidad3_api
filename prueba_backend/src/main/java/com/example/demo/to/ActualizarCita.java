package com.example.demo.to;

import java.time.LocalDateTime;

public class ActualizarCita {
	
	private String diagnostico;
	private String receta;
	private LocalDateTime proximaCita;
	
	
	public ActualizarCita() {
		super();
	}
	public ActualizarCita(String diagnostico, String receta, LocalDateTime proximaCita) {
		super();
		this.diagnostico = diagnostico;
		this.receta = receta;
		this.proximaCita = proximaCita;
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
