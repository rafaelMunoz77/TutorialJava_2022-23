package examenes.arraysConObjetos_Baraja;

import java.util.Arrays;
import java.util.Iterator;

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
	 * 
	 */
	public void pasaUnaCartaDeAbajoHastaArriba () {
		Carta aux = this.cartas[0];
		for (int i = 0; i < cartas.length - 1; i++) {
			this.cartas[i] = this.cartas[i + 1];
		}
		this.cartas[this.cartas.length - 1] = aux;
	}

	
	/**
	 * 
	 */
	public void pasaUnaCartaDeArribaHastaAbajo () {
		Carta aux = this.cartas[this.cartas.length - 1];
		for (int i = this.cartas.length - 1; i > 0; i--) {
			this.cartas[i] = this.cartas[i -1];
		}
		this.cartas[0] = aux;
	}

	
	/**
	 * 
	 */
	public void mezcla() {
		for (int i = 0; i < 1000; i++) {
			int pos1 = (int) Math.round(Math.random() * (this.cartas.length - 1));
			int pos2 = (int) Math.round(Math.random() * (this.cartas.length - 1));
			Carta aux = this.cartas[pos1];
			this.cartas[pos1] = this.cartas[pos2];
			this.cartas[pos2] = aux;
		}
	}
	
	/**
	 * 
	 */
	public void ordena() {
		boolean seHanHechoIntercambios = false;
		// Ordeno por la burbuja
		do {
			seHanHechoIntercambios = false;

			for (int i = 0; i < this.cartas.length - 1; i++) {
				if (this.cartas[i].getId() > this.cartas[i+1].getId()) {
					Carta aux = this.cartas[i+1];
					this.cartas[i+1] = this.cartas[i];
					this.cartas[i] = aux;
					seHanHechoIntercambios = true;
				}
			}

		} while (seHanHechoIntercambios == true);
	}
	
	
	/**
	 * 
	 * @param j
	 */
	public void repartirManoAJugador (Jugador j) {
		int cont = 0;
		for (int i = 0; i < this.cartas.length && cont < 5; i++) {
			if (this.cartas[i] != null) {
				j.getMano()[cont] = this.cartas[i];				
				this.cartas[i] = null;
				cont++;
			}
		}
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
		String str = "";
		for (int i = 0; i < cartas.length; i++) {
			if (this.cartas[i] != null) {
				str += cartas[i].toString();
			}
			else {
				str += " null ";
			}
			if ((i + 1) % 13 == 0) {
				str += "\n";
			}
		}
		return str;
	}
	
	
}
