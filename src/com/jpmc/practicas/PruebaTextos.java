package com.jpmc.practicas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

	
	
	public class PruebaTextos {
		//"C:\\Users\\pepem\\Downloads\\spam2.csv"
	
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int tama�o, cont = 0 , i;
	
	
	
	ArrayList <String> list = new ArrayList <String>();
	ManipulaArchivos obj1 = new ManipulaArchivos();
	
	try {
	Scanner csvData = new Scanner(new File("C:\\Users\\pepem\\Downloads\\spam2.csv"));
	while(csvData.hasNext()) {
	list.add(csvData.nextLine());
	}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
	
		for(String txt : list) {
			System.out.println(txt);
		}
	
		tama�o = list.size();
	
		System.out.println("El ultimo elemento es: "+list.get(tama�o-1));
	
		String cadena = "ham,\"I am sorry it hurt you.,\",";
	
		for(i=0; i< tama�o; i++) {
			if(cadena.equals(list.get(i))) {
				cont++;
				System.out.println("Coincide en : "+i);
			}
	}
	
	System.out.println("El numero de coincidencias es: "+cont);
	
	
	
	
	
	}
	
	
	
	}
