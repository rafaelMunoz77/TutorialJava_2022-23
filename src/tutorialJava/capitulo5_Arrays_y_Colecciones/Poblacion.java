package tutorialJava.capitulo5_Arrays_y_Colecciones;

import java.util.Arrays;

public class Poblacion {

	private Persona personas[];
	
	public Poblacion (int cantPersonas) {
		personas = new Persona[cantPersonas];
		
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona("Nombre" + i);
		}
	}

	@Override
	public String toString() {
		return this.toStringModificado();
	}
	
	
	
	public String toStringModificado() {
		String resultado = "Poblacion [personas=";
		
		for (int i = 0; i < personas.length; i++) {
			resultado += personas[i].toString() + "\n";
		}
		resultado += "]";
				
		return resultado;
	}
	
	
	
	public static void main (String args[]) {
		Poblacion cordobeses = new Poblacion(3000);
		System.out.println(cordobeses);
	}
}
