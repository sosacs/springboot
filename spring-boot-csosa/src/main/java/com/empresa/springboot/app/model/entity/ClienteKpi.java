package com.empresa.springboot.app.model.entity;

import java.io.Serializable;

public class ClienteKpi implements Serializable {

	private double promedioEdad;
	private double desviacionEstandar;

	public double getPromedioEdad() {
		return promedioEdad;
	}

	public void setPromedioEdad(double promedioEdad) {
		this.promedioEdad = promedioEdad;
	}

	public double getDesviacionEstandar() {
		return desviacionEstandar;
	}

	public void setDesviacionEstandar(double desviacionEstandar) {
		this.desviacionEstandar = desviacionEstandar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = -486712042124950127L;
}
