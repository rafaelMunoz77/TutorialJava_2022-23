package tutorialJava.capitulo5_Arrays_y_Colecciones.ejemplo02_ListYArrayList;

import java.util.ArrayList;
import java.util.List;

public class EjemploListasCromos {

	public static void main (String args[]) {
		CromoBaloncesto c1 = new CromoBaloncesto(1, "Felipe Reyes");
		CromoBaloncesto c2 = new CromoBaloncesto(2, "Lebron");
		CromoBaloncesto c3 = new CromoBaloncesto(3, "Pau Gasol");

		List<CromoBaloncesto> lista = new ArrayList<CromoBaloncesto>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		CromoBaloncesto c4 = new CromoBaloncesto(4, "Cristina Castro");
		CromoBaloncesto c5 = new CromoBaloncesto(5, "María Jesús Joyanes");
		CromoBaloncesto c6 = new CromoBaloncesto(6, "Alazne Ruiz");

		List<CromoBaloncesto> lista2 = new ArrayList<CromoBaloncesto>();
		lista2.add(c4);
		lista2.add(c5);
		lista2.add(c6);
		
		lista.addAll(1, lista2);
		lista.removeAll(lista);
		
		System.out.println("VAcía: " + lista.isEmpty());
		
		for (CromoBaloncesto c : lista) {
			System.out.println(c.toString());
		}		
		
	}
}
