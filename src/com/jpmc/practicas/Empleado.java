package com.jpmc.practicas;

public class Empleado {

	private String id;
	private String nombre;
	private String apellido;
	private double horasTrabajadas;
	private double sueldoHora;
	
	/**Constructor*/
	Empleado(String id, String nombre, String apellido){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public double getSueldoHora() {
		return sueldoHora;
	}
	
	
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public void setSueldoHora(double sueldoHora) {
		this.sueldoHora = sueldoHora;
	}

	/**
	 * 
	 * @return Nomina.
	 */
	public double calcularSalario() {
		return this.horasTrabajadas*this.sueldoHora;
	}
	
}
