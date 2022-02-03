package com.jpmc.practicas;

public class Dog {

	private String nombre;
	private double estatura;
	private int edad;
	
	Dog(String nombre, double estatura, int edad){
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
	}
	
	public void hablar() {
		System.out.println("WOOF WOOF");
	}
	
	public void rodar() {
		System.out.println("Mira! estoy rodando!");
	}
	
	public void realizarActividad() {
		System.out.println("NO TENGO ACTIVIDAD PARA REALIZAR :(");
	}

}
