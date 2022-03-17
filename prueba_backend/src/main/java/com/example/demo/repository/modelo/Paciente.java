package com.example.demo.repository.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente")
	@SequenceGenerator(name = "seq_paciente", sequenceName = "seq_paciente", allocationSize = 1)
	@Column(name="paci_id")
	private Integer id;
	@Column(name="paci_cedula")
	private String cedula;
	@Column(name="paci_nombre")
	private String nombre;
	@Column(name="paci_apellido")
	private String apellido;
	@Column(name="paci_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name="paci_codigo_seguro")
	private String codigoSeguro;
	@Column(name="paci_estatura")
	private Double estatura;
	@Column(name="paci_peso")
	private Double peso;
	@Column(name="paci_genero")
	private Character genero;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private List<CitaMedica> citas;
	
	
	public List<CitaMedica> getCitas() {
		return citas;
	}
	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}
	public void insertarCita(CitaMedica cita) {
		citas.add(cita);
	}
	public void removerCita(CitaMedica cita) {
		citas.remove(cita);
	}
	
	public Paciente() {
		super();
	}
	public Paciente(Integer id, String cedula, String nombre, String apellido, LocalDateTime fechaNacimiento,
			String codigoSeguro, Double estatura, Double peso, Character genero) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoSeguro = codigoSeguro;
		this.estatura = estatura;
		this.peso = peso;
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
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCodigoSeguro() {
		return codigoSeguro;
	}
	public void setCodigoSeguro(String codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}
	public Double getEstatura() {
		return estatura;
	}
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Character getGenero() {
		return genero;
	}
	public void setGenero(Character genero) {
		this.genero = genero;
	}
	
	
	
	
	

}
