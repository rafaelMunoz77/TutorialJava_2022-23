package tutorialJava.capitulo5_Arrays_y_Colecciones.ejemplo02_ListYArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo02_ListaCromos {

	public static void main(String[] args) {
		List<CromoBaloncesto> cromos1 = new ArrayList<CromoBaloncesto>();

		
		cromos1.add(new CromoBaloncesto(1, "Pau Gasol"));
		cromos1.add(new CromoBaloncesto(2, "Ricky Rubio"));
		cromos1.add(new CromoBaloncesto(3, "Michael Jordan"));
		
		cromos1.clear();
		
		for (int i = 0; i < cromos1.size(); i++) {
			System.out.println(cromos1.get(i).toString());
		}
	}

}
