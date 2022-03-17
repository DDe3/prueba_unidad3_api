package com.example.demo.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doctor")
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)
	@Column(name="doct_id")
	private Integer id;
	@Column(name="doct_cedula")
	private String cedula;
	@Column(name="doct_nombre")
	private String nombre;
	@Column(name="doct_apellido")
	private String apellido;
	@Column(name="doct_fecha_nacimiento")
	private LocalDate fechaNacimiento;
	@Column(name="doct_numero_consultorio")
	private Integer numeroConsultorio;
	@Column(name="doct_codigo_senescyt")
	private String codigoSenescyt;
	@Column(name="doct_genero")
	private Character genero;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private List<CitaMedica> citas;
	
	
	
	

	public Doctor() {
		super();
	}
	public Doctor(Integer id, String cedula, String nombre, String apellido, LocalDate fechaNacimiento,
			Integer numeroConsultorio, String codigoSenescyt, Character genero) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroConsultorio = numeroConsultorio;
		this.codigoSenescyt = codigoSenescyt;
		this.genero = genero;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getNumeroConsultorio() {
		return numeroConsultorio;
	}
	public void setNumeroConsultorio(Integer numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}
	public String getCodigoSenescyt() {
		return codigoSenescyt;
	}
	public void setCodigoSenescyt(String codigoSenescyt) {
		this.codigoSenescyt = codigoSenescyt;
	}
	public Character getGenero() {
		return genero;
	}
	public void setGenero(Character genero) {
		this.genero = genero;
	}
	
	
	

}
