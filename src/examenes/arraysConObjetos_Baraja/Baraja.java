package examenes.arraysConObjetos_Baraja;

import java.util.Arrays;

public class Baraja {
	private Carta cartas[] = new Carta[52];

	/**
	 * 
	 */
	public Baraja() {
		int j = 0;
		// Incializo las cartas de la baraja
		// Picas
		for (int i = 0; i < 13; i++, j++) {
			this.cartas[i] = new Carta("Picas", i + 1, j);
		}
		// Diamantes
		for (int i = 0; i < 13; i++, j++) {
			this.cartas[j] = new Carta("Diamantes", i + 1, j);
		}
		// Tréboles
		for (int i = 0; i < 13; i++, j++) {
			this.cartas[j] = new Carta("Tréboles", i + 1, j);
		}
		// Corazones
		for (int i = 0; i < 13; i++, j++) {
			this.cartas[j] = new Carta("Corazones", i + 1, j);
		}
		
	}

	/**
	 * @param cartas
	 */
	public Baraja(Carta[] cartas) {
		this.cartas = cartas;
	}

	/**
	 * @return the cartas
	 */
	public Carta[] getCartas() {
		return cartas;
	}

	/**
	 * @param cartas the cartas to set
	 */
	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}
	
	
}
