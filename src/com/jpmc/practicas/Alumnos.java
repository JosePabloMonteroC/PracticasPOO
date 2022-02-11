package com.jpmc.practicas;

public class Alumnos{
	
	private String nombre;
	private String apellido;
	private int edad;
	private int semestre;
	String[] libros = new String[4];
	private int cantidadLibros = 0;

	Alumnos(String nombre, String apellido, int edad ,int semestre){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.semestre = semestre;
	}
	
	public void prestamo(String nombreLibro){
		if(cantidadLibros == 3) {
			System.out.println("Lo sentimos, pero excediste el numero de libros que se te pueden prestar, por favor espera 1 semana...");
		}
		else {
			libros[cantidadLibros] = nombreLibro;
			cantidadLibros++;
		}
	}
	
	public void datosLibros() {
		for(int i = 0; i < cantidadLibros; i++) {
			System.out.println("Libro #"+(i+1)+": "+libros[i]);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public int getSemestre() {
		return semestre;
	}

	public String[] getLibros() {
		return libros;
	}

	public int getCantidadLibros() {
		return cantidadLibros;
	}
	
	
	
	

}
