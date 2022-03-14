package com.jpmc.practicas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.AbstractCollection;
import java.util.AbstractList;

public class ManipulaArchivos {

	/**
	 * Funcion para leer y llenar el ArrayList desde un archivo csv.
	 * @param path
	 * @return
	 */

	public ArrayList <String> regresaArrayList(String path) {
		
		ArrayList <String> list = new ArrayList <String>();
		
		try {
			Scanner csvData = new Scanner(new File(path));
			while(csvData.hasNext()) {
			list.add(csvData.nextLine());
			}
				}catch(FileNotFoundException ex) {
					System.out.println(ex.toString());
				}
		return list;		
	}
	/**
	 * Funcion para llenar arreglo bidimensional
	 * @param listDos
	 * @return dividir
	 */
	
	public String[][] llenarArray(ArrayList <String> listDos){
		String dividir[][] = new String[listDos.size()][];
		
		for(int i =0; i < listDos.size();i++) {
			dividir[i] = listDos.get(i).split(",");
		}
		return dividir;
		
	}
	
	/**
	 * Funcion que imprime las modificaciones
	 * @param list2
	 * @return tempArray
	 */
	public String[] imprimirModificada(ArrayList<String>list2) {
		
		String[] tempArray = list2.toArray(new String[0]);
		
		for(int i =0;i < tempArray.length;i++) {
			System.out.print(tempArray[i].replaceAll("mo[\\w]*"," ").replaceAll("\\d", " ").replaceAll("\\W", " "));
			System.out.println(" ");
		}
		return tempArray;
	}
	
	/**
	 * Funcion para concatenar un string si se cumple la condicion dada.
	 * @param list2
	 * @return tempArray.
	 */
	
	public String[] concatenar(ArrayList<String>list2) {
		
		String[] tempArray = list2.toArray(new String[0]);
		
		for(int i =0;i < tempArray.length;i++) {
			if(tempArray[i].contains("I am")==true) {
				tempArray[i] = "FEEL1| "+tempArray[i];
			}
			else if(tempArray[i].contains("is not")==true){
				tempArray[i] = "FEEL2| "+tempArray[i];
			}
			else if(tempArray[i].contains("to the")==true) {
			
			tempArray[i] = "FEEL3| "+tempArray[i];
			}
		}
		return tempArray;
	}
	
	public ArrayList <String> eliminarPalabras(ArrayList<String> list2, ArrayList<String> listElim, ArrayList<String> listPalabrasEliminadas){
		
		ArrayList<String> list = new ArrayList<String>();
		
		String[] eliminados = list2.toArray(new String[0]);
		String[] palabras = listElim.toArray(new String[0]);
		
		for(int i =0; i<=eliminados.length;i++) {
			for(int j =0; j<palabras.length;j++) {
				if(eliminados[i].contains(palabras[j])==true) {
					eliminados[i] = eliminados[i].replaceAll(palabras[j]+"[\\w]*", " ");
					listPalabrasEliminadas.add(palabras[j]);
				}
			}
			System.out.println(eliminados[i]);
			list.add(eliminados[i]);
		}
		
		return list;
	}

}
