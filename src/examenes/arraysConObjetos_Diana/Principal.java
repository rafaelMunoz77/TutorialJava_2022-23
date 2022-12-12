package examenes.arraysConObjetos_Diana;

import java.util.Iterator;

import tutorialJava.Utils;

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
		for (int i = 0; i < 10; i++) { // Diez turnos
			for (int j = 0; j < jugadores.length; j++) { // Para cada jugador
				for (int k = 0; k < 3; k++) {
					System.out.println("\n\nTurno del jugador: " + jugadores[j].getNombre());
					System.out.println("Dardo número " + (k + 1));
//					int opcionJugador = mostrarMenu(tiradas);
	
					int opcionJugador = Utils.obtenerNumeroAzar(0, 61);
					
					// Compruebo si la jugada elegida se cumple
					int azar = Utils.obtenerNumeroAzar(0, 100);
					if (azar <= tiradas[opcionJugador].getProbabilidad()) {
						jugadores[j].setPuntuacion(jugadores[j].getPuntuacion() +
								tiradas[opcionJugador].getPuntos());
					}
				}
			}
		}
		
		ordenaJugadoresPorPuntuacion(jugadores);
		
		// Imprimo podium de los jugadores
		for (int i = 0; i < 3; i++) {
			System.out.println("Jugador: " + jugadores[i].getNombre() + 
					" - Puntuación: " + jugadores[i].getPuntuacion());
		}
	}
	

	/**
	 * 
	 * @param jugadores
	 */
	private static void ordenaJugadoresPorPuntuacion (Jugador[] jugadores) {
		boolean seHanHechoIntercambios = false;
		do {
			seHanHechoIntercambios = false;

			for (int i = 0; i < jugadores.length - 1; i++) {
				if (jugadores[i].getPuntuacion() < jugadores[i+1].getPuntuacion()) {
					Jugador aux = jugadores[i+1];
					jugadores[i+1] = jugadores[i];
					jugadores[i] = aux;
					seHanHechoIntercambios = true;
				}
			}

		} while (seHanHechoIntercambios == true);

	}
	

	/**
	 * 
	 * @param tiradas
	 * @return
	 */
	private static int mostrarMenu (Tirada tiradas[]) {
		System.out.println("MENÚ DE JUGADAS");
		for (int i = 0; i < tiradas.length; i++) {
			System.out.println(i + ".- Tirada: " + tiradas[i].getDescripcion());
		}

		return Utils.obtenerEnteroConDescripcion("Elija su opción: ");
	}

}
