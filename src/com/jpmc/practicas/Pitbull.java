package com.jpmc.practicas;

public class Pitbull extends Dog{

	private String colorDePelo;
	private String tamano;

	Pitbull(String nombre, double estatura, int edad, String colorDePelo, String tamano) {
		super(nombre, estatura, edad);
		this.colorDePelo = colorDePelo;
		this.tamano = tamano;
	}
	
	public void realizarActividad() {
		System.out.println("Adios me dormi");
	}
	
	public void atacar() {
		System.out.println("GRRRRRR");
	}

}
