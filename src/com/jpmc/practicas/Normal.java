package com.jpmc.practicas;

public class Normal {

	private double media;
	private double desviacionE;
	private double areaTot = 0.0;
	private double fdeX = 0.0;

	/**
	 * Constructor
	 * @param media
	 * @param desviacionE
	 */
	Normal(double media, double desviacionE){
		this.media = media;
		this.desviacionE = desviacionE;
	}
	
	/**
	 * Funcion que calcula el valor de f(x).
	 * @param x
	 * @throws Exception
	 */
	public void calcularValorFDN(double x) throws Exception{
		if(this.media == 0 || this.desviacionE == 0) {
			throw new ArithmeticException("Error en los valores de media o de desviacionE");
		}else {
			this.fdeX = (1/(this.desviacionE*(Math.sqrt(2*Math.PI))))*Math.exp(-0.5*((Math.pow((x-this.media),2))/(Math.pow(this.desviacionE, 2))));
		}
	}
	
	/**
	 * Funcion que calcula el valor de la probabilidad.
	 * @param limInf
	 * @param limSup
	 * @param delta
	 * @throws Exception
	 */
	public void calcularProbFDN(double limInf, double limSup, double delta) throws Exception{
		double i;
		for(i = limInf; i <= limSup; i+=delta) {
			this.calcularValorFDN(i);
			this.areaTot += (this.fdeX*delta);
		}
	}
	
	/**
	 * GETS
	 * @return atributo
	 */
	public double getMedia() {
		return media;
	}

	public double getDesviacionE() {
		return desviacionE;
	}

	public double getAreaTot() {
		return areaTot;
	}

	public double getFdeX() {
		return fdeX;
	}

}
