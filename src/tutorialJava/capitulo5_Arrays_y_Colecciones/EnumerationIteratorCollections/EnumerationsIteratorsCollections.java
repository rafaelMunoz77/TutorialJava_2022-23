package tutorialJava.capitulo5_Arrays_y_Colecciones.EnumerationIteratorCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;


public class EnumerationsIteratorsCollections {

	public static void main(String[] args) {
		
		// Instancio un nuevo elemento de la Interface List, a trav�s de la creaci�n de un objeto
		// que implementa la interfaz, en concreto en este caso se utiliza la clase ArrayList
		List<Cromo> cromos = new ArrayList<Cromo>();
		inicializaListaCromos(cromos);
		mostrarLista("Lista inicializada", cromos);
		
		// Ejemplo de manejo y recorrido de un objeto Enumeration
//		ejemploEnumeration(cromos);
		
		// Ejemplo de manejo y recorrido de un objeto Iterator
//		ejemploIterator(cromos);
		
		// Ordenaci�n de los elementos por su cromo.id
		Collections.shuffle(cromos);
		mostrarLista("Elementos mezclados", cromos);
		ejemploOrdenacionListAscendentePorCromoId(cromos);
		
		// Ordenacion de los elementos por su cromo.id descendente
//		Collections.shuffle(cromos);
//		mostrarLista("Elementos mezclados", cromos);
//		ejemploOrdenacionListDescendentePorCromoId(cromos);
		
		// Ordenaci�n de los elementos por su cromo.descripcion
//		Collections.shuffle(cromos);
//		mostrarLista("Elementos mezclados", cromos);
//		ejemploOrdenacionListAscendentePorCromoDescripcion(cromos);
		
		// Ordenaci�n de los elementos por su cromo.descripcion descendente
//		Collections.shuffle(cromos);
//		mostrarLista("Elementos mezclados", cromos);
//		ejemploOrdenacionListDescendentePorCromoDescripcion(cromos);
		
		// Revertir las posiciones de los elementos en una coleccion
//		Collections.reverse(cromos);
//		mostrarLista("Lista con posiciones de forma inversa", cromos);
	}
	
	
	/**
	 * 
	 * @param cromos
	 */
	public static void inicializaListaCromos (List<Cromo> cromos) {
		cromos.add(new Cromo (1, "Pau Gasol"));
		cromos.add(new Cromo (2, "Marc Gasol"));
		cromos.add(new Cromo (3, "Rudy Fern�ndez"));
		cromos.add(new Cromo (4, "Ricky Rubio"));
		cromos.add(new Cromo (5, "Felipe Reyes"));
		cromos.add(new Cromo (6, "Juan Carlos Navarro"));
		cromos.add(new Cromo (7, "Jorge Garbajosa"));
		cromos.add(new Cromo (8, "Albert Oliver"));
		cromos.add(new Cromo (9, "Juancho Hernang�mez"));
		cromos.add(new Cromo (10, "Fernando San Emeterio"));
	}
	
	
	
	/**
	 * 
	 * @param cromos
	 */
	public static void ejemploOrdenacionListAscendentePorCromoId (List<Cromo> cromos) {
		// Ordenaci�n del array de forma personalizada y recorrido
		
		Comparator<Cromo> comparador = new Comparator<Cromo>() {
			@Override
			public int compare(Cromo o1, Cromo o2) {
				return o1.getDescripcion().compareTo(o2.getDescripcion()) * -1;
			}
		};
		
		Collections.sort(cromos, comparador);
		
		mostrarLista("Ordenaci�n ascendente por cromo.id", cromos);
	}
	
	
	
	/**
	 * 
	 * @param cromos
	 */
	public static void ejemploOrdenacionListDescendentePorCromoId (List<Cromo> cromos) {
		// Ordenaci�n del array de forma personalizada y recorrido
		Collections.sort(cromos, new Comparator<Cromo>() {
			@Override
			public int compare(Cromo cromo1, Cromo cromo2) {
				return cromo2.getId() - cromo1.getId();
			}
		});
		
		mostrarLista("Ordenaci�n descendente por cromo.id", cromos);
	}
	
	
	
	/**
	 * 
	 * @param cromos
	 */
	public static void ejemploOrdenacionListAscendentePorCromoDescripcion (List<Cromo> cromos) {
		// Ordenaci�n del array de forma personalizada y recorrido
		Collections.sort(cromos, new Comparator<Cromo>() {
			@Override
			public int compare(Cromo cromo1, Cromo cromo2) {
				return cromo1.getDescripcion().compareTo(cromo2.getDescripcion());
			}
		});
		
		mostrarLista("Ordenaci�n ascendente por cromo.descripcion", cromos);
	}
	
	
	
	/**
	 * 
	 * @param cromos
	 */
	public static void ejemploOrdenacionListDescendentePorCromoDescripcion (List<Cromo> cromos) {
		// Ordenaci�n del array de forma personalizada y recorrido
		Collections.sort(cromos, new Comparator<Cromo>() {
			@Override
			public int compare(Cromo cromo1, Cromo cromo2) {
				return 0 - cromo1.getDescripcion().compareTo(cromo2.getDescripcion());
			}
		});
		
		mostrarLista("Ordenaci�n descendente por cromo.descripcion", cromos);
	}
	
	
	
	/**
	 * 
	 * @param cromos
	 */
	public static void ejemploIterator (List<Cromo> cromos) {
		Iterator<Cromo> it = cromos.iterator();
		// Recorrido de un Iterator
		System.out.println("Recorrido de los objetos Cromo a trav�s de un Iterator");
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println("\n");
	}
	
	
	/**
	 * 
	 * @param cromos
	 */
	public static void ejemploEnumeration (List<Cromo> cromos) {
		// Creaci�n de un objeto Enumeration a partir de un objeto Collection
		Enumeration<Cromo> en = Collections.enumeration(cromos);
		// Recorrido de la Enumeration
		System.out.println("Recorrido de los objetos Cromo a trav�s de una Enumeration");
		while (en.hasMoreElements()) {
			System.out.println("Id: " + en.nextElement().getId() + " - Nombre: " + en.nextElement().getDescripcion());
		}		
		System.out.println("\n");
	}
	
	
	/**
	 * 
	 * @param titulo
	 * @param cromos
	 */
	private static void mostrarLista (String titulo, List<Cromo> cromos) {
		System.out.println(titulo);
		for (int i = 0; i < cromos.size(); i++) {
			System.out.println(cromos.get(i));
		}
		System.out.println("\n");
	}

}
