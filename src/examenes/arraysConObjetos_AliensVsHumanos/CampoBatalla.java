package examenes.arraysConObjetos_AliensVsHumanos;

import java.util.Arrays;

public class CampoBatalla {
	
	public static int LONGITUD_ARRAYS = 20;
	
	String nombre;
	Humano humanos[] = new Humano[LONGITUD_ARRAYS];
	Malvado malvados[] = new Malvado[LONGITUD_ARRAYS];
	
	/**
	 * 
	 */
	public CampoBatalla() {
		super();
		
		// Incializo los arrays
		for (int i = 0; i < humanos.length; i++) {
			this.humanos[i] = new Humano("Humano " + (i + 1), 
					(int) Math.round(Math.random() * (100 - 50) + 50), 
					true, 0);
			this.malvados[i] = new Malvado("Malvado " + (i + 1), 
					(int) Math.round(Math.random() * (100 - 50) + 50), 
					true, 0);
		}
		
		// Coloco el doble de vida al último de cada array
		Humano ultimoHumano = this.humanos[this.humanos.length - 1];
		ultimoHumano.setPuntosVida(ultimoHumano.getPuntosVida() * 2);

		Malvado ultimoMalvado = this.malvados[this.malvados.length - 1];
		ultimoMalvado.setPuntosVida(ultimoMalvado.getPuntosVida() * 2);
	}

	/**
	 * @param nombre
	 * @param humanos
	 * @param malvados
	 */
	public CampoBatalla(String nombre, Humano[] humanos, Malvado[] malvados) {
		super();
		this.nombre = nombre;
		this.humanos = humanos;
		this.malvados = malvados;
	}


	/**
	 * 
	 */
	public void mezclarHumanos () {
		for (int i = 0; i < humanos.length; i++) {
			int pos1 = (int) Math.round(Math.random() * (this.humanos.length - 1));
			int pos2 = (int) Math.round(Math.random() * (this.humanos.length - 1));
			Humano aux = this.humanos[pos1];
			this.humanos[pos1] = this.humanos[pos2];
			this.humanos[pos2] = aux;
		}
	}
	
	/**
	 * 
	 */
	public void mezclarMalvados () {
		for (int i = 0; i < malvados.length; i++) {
			int pos1 = (int) Math.round(Math.random() * (this.malvados.length - 1));
			int pos2 = (int) Math.round(Math.random() * (this.malvados.length - 1));
			Malvado aux = this.malvados[pos1];
			this.malvados[pos1] = this.malvados[pos2];
			this.malvados[pos2] = aux;
		}
	}
	
	
	/**
	 * 
	 */
	public void comenzarBatalla() {
		
		do {
			muestraCampoBatalla();
			
			// Quito puntos de vida al malvado vivo
			Malvado primerMalvadoVivo = getPrimerMalvadoVivo();
			primerMalvadoVivo.setPuntosVida(
					primerMalvadoVivo.getPuntosVida() - (int) Math.round(Math.random()* ((20) + 5)));
					primerMalvadoVivo.setContadorDisparos(primerMalvadoVivo.getContadorDisparos() + 1);
			// Si no quedan puntos de vida me lo cargo
			if (primerMalvadoVivo.getPuntosVida() <= 0) {
				primerMalvadoVivo.setVivo(false);
			}
			
			// Si después de disparar al primer malvado vivo, los malvados se extinguen
			// debo salir del bucle
			if (getPrimerMalvadoVivo() == null) {
				System.out.println("Han ganado los Humanos");
				break;
			}
			
			// Quito puntos de vida al humano vivo
			Humano primerHumanoVivo = getPrimerHumanoVivo();
			primerHumanoVivo.setPuntosVida(
					primerHumanoVivo.getPuntosVida() - (int) Math.round(Math.random()* ((20) + 5)));
			primerHumanoVivo.setContadorDisparos(primerHumanoVivo.getContadorDisparos() + 1);
			// Si no quedan puntos de vida me lo cargo
			if (primerHumanoVivo.getPuntosVida() <= 0) {
				primerHumanoVivo.setVivo(false);
			}

			// Si después de disparar al primer humano vivo, los humanos se extinguen
			// debo salir del bucle
			if (getPrimerHumanoVivo() == null) {
				System.out.println("Han ganado los Malvados");
			}
		
		} while ( !(getPrimerHumanoVivo() == null || getPrimerMalvadoVivo() == null) );
		
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private Malvado getPrimerMalvadoVivo() {
		for (int i = 0; i < malvados.length; i++) {
			if (malvados[i].isVivo() == true) {
				return malvados[i];
			}
		}
		return null;
	}
	
	
	/**
	 * 
	 * @return
	 */
	private Humano getPrimerHumanoVivo() {
		for (int i = 0; i < humanos.length; i++) {
			if (humanos[i].isVivo() == true) {
				return humanos[i];
			}
		}
		return null;
	}

	
	/**
	 * 
	 * @return
	 */
	public Malvado getMalvadoMasDuro() {
		Malvado mayor = this.malvados[0];
		for (int i = 1; i < malvados.length; i++) {
			if (malvados[i].getContadorDisparos() > mayor.getContadorDisparos()) {
				mayor = malvados[i];
			}
		}
		return mayor;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Malvado getMalvadoMasBlandito() {
		Malvado menor = this.malvados[0];
		for (int i = 1; i < malvados.length; i++) {
			if (malvados[i].getContadorDisparos() < menor.getContadorDisparos()) {
				menor = malvados[i];
			}
		}
		return menor;
	}
	
	
	
	
	/**
	 * 
	 * @return
	 */
	public Humano getHumanoMasDuro() {
		Humano mayor = this.humanos[0];
		for (int i = 1; i < humanos.length; i++) {
			if (humanos[i].getContadorDisparos() > mayor.getContadorDisparos()) {
				mayor = humanos[i];
			}
		}
		return mayor;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Humano getHumanoMasBlandito() {
		Humano menor = this.humanos[0];
		for (int i = 1; i < humanos.length; i++) {
			if (humanos[i].getContadorDisparos() < menor.getContadorDisparos()) {
				menor = humanos[i];
			}
		}
		return menor;
	}
	
	
	
	
	/**
	 * 
	 */
	private void muestraCampoBatalla() {
		// Muestro los humanos
		for (int i = 0; i < humanos.length; i++) {
			if (this.humanos[i].isVivo()) {
				System.out.print("H: " + humanos[i].getNombre() + ", " + humanos[i].getPuntosVida() + " ");
			}
		}
		System.out.println();
		
		// Muestro los malvados
		for (int i = 0; i < malvados.length; i++) {
			if (this.malvados[i].isVivo()) {
				System.out.print("M: " + malvados[i].getNombre() + ", " + malvados[i].getPuntosVida() + " ");
			}
		}
		System.out.println("\n");
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the humanos
	 */
	public Humano[] getHumanos() {
		return humanos;
	}

	/**
	 * @param humanos the humanos to set
	 */
	public void setHumanos(Humano[] humanos) {
		this.humanos = humanos;
	}

	/**
	 * @return the malvados
	 */
	public Malvado[] getMalvados() {
		return malvados;
	}

	/**
	 * @param malvados the malvados to set
	 */
	public void setMalvados(Malvado[] malvados) {
		this.malvados = malvados;
	}

	@Override
	public String toString() {
		return "CampoBatalla [nombre=" + nombre + ", humanos=" + Arrays.toString(humanos) + ", malvados="
				+ Arrays.toString(malvados) + "]";
	}
	
	
}
