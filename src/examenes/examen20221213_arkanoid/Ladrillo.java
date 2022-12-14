package examenes.examen20221213_arkanoid;

import tutorialJava.Utils;

public class Ladrillo {
	private String color;
	private int x, y, alto, ancho, puntosVida;
	
	private static String COLORES[] = new String[] {"rojo", "verde", "azul"};
	
	/**
	 * 
	 */
	public Ladrillo() {
		super();
		this.x = Utils.obtenerNumeroAzar(0, 800);
		this.y = Utils.obtenerNumeroAzar(0, 500);
		this.alto = 50;
		this.ancho = 100;
		this.puntosVida = Utils.obtenerNumeroAzar(1, 3);
		
		// Asigno el color en función de los puntos de vida
		if (this.puntosVida == 1) {
			this.color = COLORES[Utils.obtenerNumeroAzar(0, 2)];
		}
		else {
			if (this.puntosVida == 2) {
				this.color = "plateado";
			}
			else {
				this.color = "dorado";
			}
		}
	}

	/**
	 * @param color
	 * @param x
	 * @param y
	 * @param alto
	 * @param ancho
	 * @param puntosVida
	 */
	public Ladrillo(String color, int x, int y, int alto, int ancho, int puntosVida) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.puntosVida = puntosVida;
	}

	@Override
	public String toString() {
		return "Ladrillo [color=" + color + ", x=" + x + ", y=" + y + ", alto=" + alto + ", ancho=" + ancho
				+ ", puntosVida=" + puntosVida + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	
	
}
