package com.jpmc.practicas;

public class Biblioteca {
	
	private String nombre;
	private String ubicacion;
	private int numAlumnos = 0;
	private int numProfesores = 0;
	public Alumnos alumnos[];
	public Profesores profesores[];

	Biblioteca(String nombre, String ubicacion, int numAlumnos, int numProfesores) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.numAlumnos = numAlumnos;
		this.numProfesores = numProfesores;		
	}
	
	public void agregarAlumno(String nombre, String apellido, int edad, int semestre) {
		Alumnos a = new Alumnos(nombre, apellido, edad, semestre);
		alumnos[numAlumnos] = a;
		numAlumnos++;
	}
	
	public void agregarProfesor(String nombre, String apellido, String materia,int edad) {
		Profesores p = new Profesores(nombre, apellido,materia, edad);
		profesores[numProfesores] = p;
		numProfesores++;
	}
	
	public void imprimirDatos() {
		for(int i = 0; i <= numAlumnos; i++) {
			System.out.println("Alumno #"+(i+1)+":\nNombre: "+alumnos[i].getNombre()+"\nApellido: "+alumnos[i].getApellido()+"\nEdad: "+alumnos[i].getEdad()+
					"\nSemestre: "+alumnos[i].getSemestre()+"\nTiene rentados los libros:\n");
			alumnos[i].datosLibros();
		}
		
		for(int j = 0; j <=numProfesores; j ++) {
			System.out.println("Profesor #"+(j+1)+":\nNombre: "+profesores[j].getNombre()+"\nApellido: "+profesores[j].getApellido()+"\nMateria: "+
		profesores[j].getMateria()+"\nEdad: "+profesores[j].getEdad()+"\nTiene rentados los libros:\n");
			profesores[j].datosLibros();
		}
	}

}
