package com.jpmc.practicas;

public class MinimosCuadrados {

	/**
	 * Funcion que calcula el promedio de un arreglo.
	 * @param valores
	 * @return promedio de los valores del arreglo.
	 */
	public double promedio(double[] valores){
		double prom = 0;
		for(int i = 0; i< valores.length;i++) prom += valores[i];
		return prom/valores.length;
	}

}
