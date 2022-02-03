package com.jpmc.practicas;

public class PastorAleman extends Dog{
	
		private String colorDePelo;
		private String tamano;

	PastorAleman(String nombre, double estatura, int edad, String colorDePelo, String tamano) {
		super(nombre, estatura, edad);
		this.colorDePelo = colorDePelo;
		this.tamano = tamano;
	}
	
	public void realizarActividad() {
		System.out.println("Mira! Atrape una pelota!");
	}
	
	public void proteger() {
		System.out.println("Modo proteccion activado");
	}

	

}
