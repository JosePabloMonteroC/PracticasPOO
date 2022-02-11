package com.jpmc.practicas;

public class Biblioteca {
	
	private String nombre;
	private String ubicacion;
	private int numAlumnos;
	private int numProfesores;
	public Alumnos[] alumnos = new Alumnos[40];
	public Profesores[] profesores = new Profesores[40];
	
	private int contadorA = 0;
	private int contadorP = 0;

	Biblioteca(String nombre, String ubicacion, int numAlumnos, int numProfesores) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.numAlumnos = numAlumnos;
		this.numProfesores = numProfesores;		
	}
	
	public void agregarAlumno(String nombre, String apellido, int edad, int semestre) {
		Alumnos a = new Alumnos(nombre, apellido, edad, semestre);
		alumnos[contadorA] = a;
		contadorA++;
	}
	
	public void agregarProfesor(String nombre, String apellido, String materia,int edad) {
		Profesores p = new Profesores(nombre, apellido,materia, edad);
		profesores[contadorP] = p;
		contadorP++;
	}
	
	public void imprimirDatosA() {
		
		for(int i = 0; i <= contadorA; i++) {
			System.out.println("Alumno #"+(i+1)+":\nNombre: "+alumnos[i].getNombre()+"\nApellido: "+alumnos[i].getApellido()+"\nEdad: "+alumnos[i].getEdad()+
					"\nSemestre: "+alumnos[i].getSemestre()+"\nTiene rentados los libros:\n");
			alumnos[i].datosLibros();
			System.out.println("\n");
		}	
	}
	
	public void imprimirDatosP() {
		for(int i = 0; i <= contadorP; i++) {
			System.out.println("Profesor #"+(i+1)+":\nNombre: "+profesores[i].getNombre()+"\nApellido: "+profesores[i].getApellido()+"\nMateria: "+
		profesores[i].getMateria()+"\nEdad: "+profesores[i].getEdad()+"\nTiene rentados los libros:\n");
			profesores[i].datosLibros();
			System.out.println("\n");
		}
	}

}
