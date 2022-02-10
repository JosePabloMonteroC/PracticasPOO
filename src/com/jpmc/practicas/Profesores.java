package com.jpmc.practicas;

public class Profesores {

	private String nombre;
	private String apellido;
	private String materia;
	private int edad;
	String libros[];
	private int cantidadLibros = 0;

	Profesores(String nombre, String apellido,String materia, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.materia = materia;
		this.edad = edad;
	}
	
	public void prestamo(String nombreLibro){
		if(cantidadLibros == 5) {
			System.out.println("Lo sentimos, pero excediste el numero de libros que se te pueden prestar, por favor espera 2 semanas...");
		}
		else {
			libros[cantidadLibros] = nombreLibro;
			cantidadLibros++;
		}
	}
	public void datosLibros() {
		for(int i = 0; i <= cantidadLibros; i++) {
			System.out.println("\nLibro: "+libros[i]+"\n");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getMateria() {
		return materia;
	}

	public int getEdad() {
		return edad;
	}

	public String[] getLibros() {
		return libros;
	}

	public int getCantidadLibros() {
		return cantidadLibros;
	}
	
	

}
