package com.jpmc.practicas;

//En este archivo se ejecutan todas las practicas, cada practica esta guardada en su clase correspondiente, por lo que cada clase necesita un main individual
//para poder funcionar.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		ArrayList <String> listDos;
		String[] miString;
		
		
		
		ManipulaArchivos obj1 = new ManipulaArchivos();
		listDos = obj1.regresaArrayList("C:\\Users\\pepem\\Downloads\\spam2.csv");
		miString = obj1.concatenar(listDos);
		
		for(int i= 0; i < miString.length;i++) {
			System.out.println(miString[i]);
		}	
	}

}
