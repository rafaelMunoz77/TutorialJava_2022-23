package examenes.arraysConObjetos_Diana;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		Jugador jugadores[] = new Jugador[4];
		Tirada tiradas[] = new Tirada[62];
		
		// Inicializo el array de jugadores
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador("Jugador " + i, 0);
		}

		
		// Inicializo las tiradas
		for (int i = 0; i < 20; i++) {
			tiradas[i] = new Tirada("Cuña completa del " + (i + 1), i + 1, 
					(int) Math.round(Math.random() * (80 - 60) + 60));
		}
		
		for (int i = 0; i < 20; i++) {
			tiradas[i + 20] = new Tirada("Doble del " + (i + 1), (i + 1) * 2, 
				(int) Math.round(Math.random() * (60 - 40) + 40));
		}
		
		for (int i = 0; i < 20; i++) {
			tiradas[i + 40] = new Tirada("Triple del " + (i + 1), (i + 1) * 3, 
					(int) Math.round(Math.random() * (40 - 20) + 20));
		}
		
		tiradas[60] = new Tirada("Corona ", 50, (int) Math.round(Math.random() * (20 - 10) + 10));
		tiradas[61] = new Tirada("Centro ", 100, (int) Math.round(Math.random() * (10 - 5) + 5));
		
		
		// Turnos de jugadores
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < jugadores.length; j++) {
				System.out.println("Turno del jugador: " + jugadores[j].getNombre());
				mostrarMenu(tiradas);
			}
			
			
			
		}
	}

	/**
	 * 
	 * @param tiradas
	 * @return
	 */
	private static int mostrarMenu (Tirada tiradas[]) {
		for (int i = 0; i < tiradas.length; i++) {
			System.out.println(i + "Tirada: " + tiradas[i].getDescripcion());
		}
		return 0;
	}

}
