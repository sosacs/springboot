package com.empresa.springboot.app.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "clientes")
@ApiModel(description = "Descripcion del cliente:")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@ApiModelProperty(notes = "Nombre del cliente:")
	private String nombre;

	@NotNull
	@ApiModelProperty(notes = "Apellido del cliente:")
	private String apellido;

	@NotNull
	@ApiModelProperty(notes = "Edad del cliente:")
	private int edad;

	@Past
	@NotNull
	@ApiModelProperty(notes = "Fecha de Nacimiento del cliente (<=) a hoy:")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	@Transient
	@Temporal(TemporalType.DATE)
	@ApiModelProperty(notes = "Fecha probable de muerte:")
	private Date fechaProbableDeMuerte;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaProbableDeMuerte() {
		return fechaProbableDeMuerte;
	}

	public void setFechaProbableDeMuerte(Date fechaProbableDeMuerte) {
		this.fechaProbableDeMuerte = fechaProbableDeMuerte;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

}
