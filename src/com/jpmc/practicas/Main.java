package com.jpmc.practicas;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog("Max", 60, 3);
		PastorAleman pa1 = new PastorAleman("Zeus", 120, 5, "Cafe", "Extra Grande");
		Pitbull p1 = new Pitbull("Damian",105 , 3, "Gris", "Mediano");
		
		System.out.println("La actividad para el primer perro es: ");
		d1.realizarActividad();
		System.out.println("La actividad para el Segundo perro es: ");
		pa1.realizarActividad();
		System.out.println("La actividad para el Tercer perro es: ");
		p1.realizarActividad();

	}

}
