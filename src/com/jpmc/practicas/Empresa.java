package com.jpmc.practicas;


public class Empresa {
	private String nombre;
	private String giro;
	private String direccion;
	public Empleado[] empleados = new Empleado[40];
	public EmpleadoComision[] empleadoC = new EmpleadoComision[40];
	public EmpleadoSueldo[] empleadoS = new EmpleadoSueldo[40];
	private int numeroEmpleados;
	
	private int contadore = 0;
	private int contadorC = 0;
	private int contadorS = 0;
	
	/**Constructor*/
	Empresa(String nombre,String giro, String direccion, int numeroEmpleados){
		this.nombre = nombre;
		this.giro = giro;
		this.direccion = direccion;
		this.numeroEmpleados = numeroEmpleados;
	}
	
	

	/**
	 * Metodo para agregar un nuevo objeto de tipo Empleado.
	 * @param id
	 * @param nombre
	 * @param apellido
	 */
	public void agregarEmpleado(String id, String nombre, String apellido, double horasTrabajadas, double sueldoHora) {
		Empleado e = new Empleado(id,nombre, apellido);
		e.setHorasTrabajadas(horasTrabajadas);
		e.setSueldoHora(sueldoHora);
		empleados[contadore] = e;
		contadore++;
	}
	
	/**
	 * Metodo para agregar un nuevo objeto de tipo EmpleadoComision.
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param porcentaje
	 * @param sueldoBasico
	 * @param ventasTotales
	 */
	
	public void agregarEmpleadoComision(String id,String nombre, String apellido,double porcentaje, double sueldoBasico,double ventasTotales ) {
		EmpleadoComision eC = new EmpleadoComision(id,nombre,apellido,porcentaje,sueldoBasico,ventasTotales);
		empleadoC[contadorC] = eC;
		contadorC++;
		
	}
	
	/**
	 * Metodo para agregar un nuevo objeto de tipo Empleado.
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param sueldoBasico
	 */
	
	public void agregarEmpleadoSueldo(String id,String nombre, String apellido,double sueldoBasico) {
		EmpleadoSueldo eS = new EmpleadoSueldo(id,nombre,apellido,sueldoBasico);
		empleadoS[contadorS] = eS;
		contadorS++;
		
	}
	/**
	 * Metodo que calcula la nomina total de todos los empleados.
	 * @return suma de todas las nominas.
	 */
	public double calcularNominaTotal() {
		double sueldo = 0;
		
		for(int i = 0; i < contadore; i ++) {
			sueldo += empleados[i].calcularSalario();
			for(int j = 0; j < contadorC; j++) {
				sueldo += empleadoC[j].calcularSalario();
				for(int k = 0; k < contadorS; k++) {
					sueldo += empleadoS[i].getSueldo();
				}
			}
		}
		return sueldo;
	}
	
	/**
	 * getters
	 * @return atributo.
	 */
	
	public int getContadore() {
		return contadore;
	}

	public int getContadorC() {
		return contadorC;
	}

	public int getContadorS() {
		return contadorS;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGiro() {
		return giro;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	
	

}
