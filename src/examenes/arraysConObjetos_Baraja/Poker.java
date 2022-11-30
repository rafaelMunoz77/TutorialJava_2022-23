package examenes.arraysConObjetos_Baraja;

import java.util.Arrays;

public class Poker {
	private Jugador jugadores[] = new Jugador[5];

	/**
	 * 
	 */
	public Poker() {
		super();
		for (int i = 0; i < jugadores.length; i++) {
			this.jugadores[i] = new Jugador();
			this.jugadores[i].setNombre("Jugador " + i);
		}
	}

	/**
	 * @param jugadores
	 */
	public Poker(Jugador[] jugadores) {
		super();
		this.jugadores = jugadores;
	}

	/**
	 * @return the jugadores
	 */
	public Jugador[] getJugadores() {
		return jugadores;
	}

	/**
	 * @param jugadores the jugadores to set
	 */
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Poker [jugadores=" + Arrays.toString(jugadores) + "]";
	}
	
	
}
