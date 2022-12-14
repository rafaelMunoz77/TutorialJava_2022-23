package examenes.examen20221213_arkanoid;

import tutorialJava.Utils;

public class Principal {
	public static void main (String args[]) {
		int opcion;
		do {
			Juego juego = new Juego();
			
			
			
			juego.comienzaJuego();
			
			String str = "\nJuego finalizado: "
					+ "\nOpción 0 para salir"
					+ "\nOpción 1 para volver a ejecutar"
					+ "\nElija opción: ";
			opcion = Utils.obtenerEnteroConDescripcion(str);
		} while (opcion == 1);
	}
}
