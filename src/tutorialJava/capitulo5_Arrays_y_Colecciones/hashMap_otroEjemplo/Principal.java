package tutorialJava.capitulo5_Arrays_y_Colecciones.hashMap_otroEjemplo;

import java.util.HashMap;
import java.util.Iterator;

public class Principal {

	public static HashMap<String, Articulo> saco = new HashMap<String, Articulo>();
	
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 20; i++) {
			Articulo a = new Articulo("Codigo" + i, "Nombre" + i, "Estante" + i, i);
			saco.put(a.getCodigo(), a);
		}
		
//		System.out.println("Dame el código del que quieres eliminar");
//		String cod = "Codigo9";
//		saco.remove(cod);
		
		Object keys[] = saco.keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
			System.out.println("Código: " + keys[i] + " - Value: " + saco.get(keys[i]));
		}
		
		
//		Iterator it = saco.values().iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

}
