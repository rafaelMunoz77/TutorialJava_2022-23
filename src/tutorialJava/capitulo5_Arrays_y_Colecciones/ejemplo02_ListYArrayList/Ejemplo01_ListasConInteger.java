package tutorialJava.capitulo5_Arrays_y_Colecciones.ejemplo02_ListYArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo01_ListasConInteger {

	public static void main(String[] args) {
		// Declarado la lista de Integers
		List<Integer> numeros = new ArrayList<Integer>();

		// Inicializar con 10 elementos de tipo Integer
		for (int i = 0; i < 10; i++) {
			numeros.add(100 + i);
		}
		
		// Agrego un elemento
		numeros.add(1000);
		
		// Elimino un elemento
		numeros.remove(2);

		// Inserto un elemento en una posición concreta
		numeros.add(1, 5000);
		
		// Crear una nueva lista
		List<Integer> numerosNegativos = new ArrayList<Integer>();
		
		// Inicializo la nueva lista
		for (int i = 0; i < 3; i++) {
			numerosNegativos.add(-1000 + i);
		}
		
		// Agrego la nueva lista en cualquier posición de la antigua lista
		numeros.addAll(4, numerosNegativos);
		
		// Primera forma de eliminar un elemento concreto sin conocer su posición
		// Tengo que recorrer todos los elementos de la lista
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i).intValue() == 5000) {
				numeros.remove(i);
			}
		}
		
		System.out.println("");
	}

}
