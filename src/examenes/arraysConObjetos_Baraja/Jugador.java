package examenes.arraysConObjetos_Baraja;

import java.util.Arrays;

public class Jugador {
	
	private String nombre = "";
	private Carta mano[] = new Carta[5];
	
	/**
	 * 
	 */
	public Jugador() {
		super();
	}

	/**
	 * @param nombre
	 * @param mano
	 */
	public Jugador(String nombre, Carta[] mano) {
		super();
		this.nombre = nombre;
		this.mano = mano;
	}

	
	/**
	 * 
	 */
	public void inspeccionaMano() {
		
		this.mano[0].setValor(2);
		this.mano[1].setValor(2);
		this.mano[2].setValor(3);
		this.mano[3].setValor(3);
		
		for (int i = 0; i < mano.length; i++) {
			int contadorCartasIguales = 1;
			for (int j = 0; j < mano.length; j++) {
				if (i != j) {
					if (this.mano[i].getValor() == this.mano[j].getValor()) {
						contadorCartasIguales++;
					}
				}
			}
			switch (contadorCartasIguales) {
			case 4: 
				System.out.println("Tienes un póker de " + this.mano[i].getValor());
				break;
			case 3: 
				System.out.println("Tienes un trio de " + this.mano[i].getValor());
				break;
			case 2: 
				System.out.println("Tienes una pareja de " + this.mano[i].getValor());
				break;
			}
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta[] getMano() {
		return mano;
	}

	public void setMano(Carta[] mano) {
		this.mano = mano;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + "]";
	}
	
	
	
}
