package tutorialJava.capitulo4_OO.primerEjemploPersona.ejercicios.bloque0.primerEjemploArrayConObjetos;

public class NumeroEntero {

	private int valor;

	/**
	 * 
	 */
	public NumeroEntero() {
		this.valor = (int) Math.round(Math.random() * 100);
	}

	/**
	 * @param valor
	 */
	public NumeroEntero(int valor) {
		this.valor = valor;
	}

//	@Override
//	public String toString() {
//		return "NumeroEntero [valor=" + valor + "]";
//	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
