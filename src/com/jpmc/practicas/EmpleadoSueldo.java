package com.jpmc.practicas;

public class EmpleadoSueldo extends Empleado{
	
	private double sueldo;

	EmpleadoSueldo(String id, String nombre, String apellido, double sueldo) {
		super(id, nombre, apellido);
		this.sueldo = sueldo;	
	}

	public double getSueldo() {
		return sueldo;
	}

	

}
