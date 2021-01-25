package com.empresa.springboot.app.util;

import java.util.List;

import com.empresa.springboot.app.model.entity.Cliente;

public class Util {

	public static double[] obtenerListaEdad(List<Cliente> listaClientes) {

		double[] listaEdades = new double[listaClientes.size()];
		int i = 0;
		for (Cliente cliente : listaClientes) {
			double val = Double.valueOf(cliente.getEdad());
			listaEdades[i++] = val;
		}

		System.out.println(listaEdades.length);

		return listaEdades;
	}

	public static double calcularPromedio(double numArray[]) {
		double suma = 0.0;
		double promedio = 0.0;

		for (double num : numArray) {
			suma += num;
		}

		promedio = suma / numArray.length;

		return promedio;
	}

	public static double calcularDesviacionEstandar(double numArray[]) {
		double desviacionEstandar = 0.0;
		double promedio = Util.calcularPromedio(numArray);

		for (double num : numArray) {
			desviacionEstandar += Math.pow(num - promedio, 2);
		}

		return Math.sqrt(desviacionEstandar / numArray.length);

	}

}
