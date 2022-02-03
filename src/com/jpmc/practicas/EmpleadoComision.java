package com.jpmc.practicas;

public class EmpleadoComision extends Empleado{
	
	private double porcentaje;
	private double salarioFijo;
	private double ventas;

	EmpleadoComision(String id, String nombre, String apellido,double porcentaje, double salarioFijo, double ventas) {
		super(id, nombre, apellido);
		this.porcentaje = porcentaje;
		this.salarioFijo = salarioFijo;
		this.ventas = ventas;
		
	} 
	
	public double calcularSalario() {
		return ventas*(porcentaje/100) + salarioFijo;
		
	}


}
