package examenes.examen20221213_arkanoid;

import java.util.Arrays;

import tutorialJava.Utils;

public class Juego {
	private Ladrillo ladrillos[] = new Ladrillo[20];
	private Ladrillo ladrillosDestruidos[] = new Ladrillo[20];	
	private Pelota pelota = new Pelota();

	/**
	 * 
	 */
	public Juego() {
		super();
		for (int i = 0; i < ladrillos.length; i++) {
			this.ladrillos[i] = new Ladrillo();
		}
	}

	/**
	 * @param ladrillos
	 * @param pelota
	 */
	public Juego(Ladrillo[] ladrillos, Pelota pelota) {
		super();
		this.ladrillos = ladrillos;
		this.pelota = pelota;
	}

	
	/**
	 * 
	 */
	public void comienzaJuego() {
		int posicionSiguienteLadrilloDestruido = 0;
		
		do {
			// Coordenadas al azar a la pelota
			this.pelota.setX(Utils.obtenerNumeroAzar(0, 900));
			this.pelota.setY(Utils.obtenerNumeroAzar(0, 600));
			
			// Compruebo si la pelota toca en algún ladrillo
			for (int i = 0; i < ladrillos.length; i++) {
				// Sólo trabajo con punteros a ladrillos diferentes de null
				if (this.ladrillos[i] != null) {
					Ladrillo l = this.ladrillos[i];
					if (this.pelota.getX() > l.getX() && 
							this.pelota.getX() < (l.getX() + l.getAncho()) && 
							this.pelota.getY() > l.getY() && 
							this.pelota.getY() < (l.getY() + l.getAlto())) {
						// Pelota toca a ladrillo
						l.setPuntosVida(l.getPuntosVida() - 1);
						// Si me quedo sin puntos de vida, elimino el ladrillo
						if (l.getPuntosVida() <= 0) {
							this.ladrillosDestruidos[posicionSiguienteLadrilloDestruido] = 
									this.ladrillos[i];
							this.ladrillos[i] = null;
							posicionSiguienteLadrilloDestruido++;
						}
					}
				}
			}
			
			// Imprimo situación actual
			imprimeSituacion();
		} while (quedanLadrillos());
		
		// Imprimo los resultados
		System.out.println("El primer ladrillo destruido fue: x " + 
				this.ladrillosDestruidos[0].getX() + " y " +
				this.ladrillosDestruidos[0].getY());
		System.out.println("El último ladrillo destruido fue: x " + 
				this.ladrillosDestruidos[this.ladrillosDestruidos.length - 1].getX() + " y " +
				this.ladrillosDestruidos[this.ladrillosDestruidos.length - 1].getY());
		
		System.out.println("\nEl orden de destrucción fue");
		for (int i = 0; i < ladrillosDestruidos.length; i++) {
			Ladrillo l = this.ladrillosDestruidos[i];
			System.out.println("Ladrillo destruido en orden " + (i + 1) + " fue: x " + 
					l.getX() + " y " + l.getY());
			
			
		}
	}
	
	
	/**
	 * 
	 */
	private void imprimeSituacion () {
		if (quedanLadrillos()) {
			System.out.println("Situación actual");
			for (int i = 0; i < ladrillos.length; i++) {
				if (this.ladrillos[i] != null) {
					System.out.print("L: " + i + 
							", pv: " + this.ladrillos[i].getPuntosVida() + "  ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * 
	 * @return
	 */
	private boolean quedanLadrillos() {
		for (int i = 0; i < ladrillos.length; i++) {
			if (this.ladrillos[i] != null) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Juego [ladrillos=" + Arrays.toString(ladrillos) + ", pelota=" + pelota + "]";
	}

	public Ladrillo[] getLadrillos() {
		return ladrillos;
	}

	public void setLadrillos(Ladrillo[] ladrillos) {
		this.ladrillos = ladrillos;
	}

	public Pelota getPelota() {
		return pelota;
	}

	public void setPelota(Pelota pelota) {
		this.pelota = pelota;
	}
	
	
}
