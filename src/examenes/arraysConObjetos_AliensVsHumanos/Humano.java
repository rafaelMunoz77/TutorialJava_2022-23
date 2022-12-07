package examenes.arraysConObjetos_AliensVsHumanos;

public class Humano {
	String nombre;
	int puntosVida;
	boolean vivo;
	int contadorDisparos;
	
	/**
	 * 
	 */
	public Humano() {
		super();
	}

	/**
	 * @param nombre
	 * @param puntosVida
	 * @param vivo
	 * @param contadorDisparos
	 */
	public Humano(String nombre, int puntosVida, boolean vivo, int contadorDisparos) {
		super();
		this.nombre = nombre;
		this.puntosVida = puntosVida;
		this.vivo = vivo;
		this.contadorDisparos = contadorDisparos;
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
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}

	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	/**
	 * @return the contadorDisparos
	 */
	public int getContadorDisparos() {
		return contadorDisparos;
	}

	/**
	 * @param contadorDisparos the contadorDisparos to set
	 */
	public void setContadorDisparos(int contadorDisparos) {
		this.contadorDisparos = contadorDisparos;
	}

	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", puntosVida=" + puntosVida + ", vivo=" + vivo + ", contadorDisparos="
				+ contadorDisparos + "]";
	}
	
	
}
