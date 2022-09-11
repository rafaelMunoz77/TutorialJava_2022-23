package tutorialJava.capitulo4_OO.primerEjemploPersona.ejercicios.bloque0.primerEjemploArrayConObjetos;

import java.util.Arrays;

public class ArrayEnteros {

	private NumeroEntero array[];

	/**
	 * 
	 */
	public ArrayEnteros() {
		array = new NumeroEntero[100];
		
		for (int i = 0; i < array.length; i++) {
			int valor = (int) Math.round(Math.random()*100);
			array[i] = new NumeroEntero(valor);
		}
	}

	/**
	 * @param array
	 */
	public ArrayEnteros(NumeroEntero[] array) {
		this.array = array;
	}

	/**
	 * 
	 */
	public void mostrar() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int sumaDelArray() {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i].getValor();
		}
		return suma;
	}
	
	/**
	 * 
	 * @return
	 */
	public float mediaDelArray() {
		return sumaDelArray() / (float) this.array.length;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public int menorDelArray() {
		int menor = 0;
		if (this.array.length > 0) {
			menor = this.array[0].getValor();
		}
		for (int i = 1; i < array.length; i++) {
			if (this.array[i].getValor() < menor) {
				menor = this.array[i].getValor();
			}
		}
		return menor;
	}
	
	/**
	 * 
	 * @return
	 */
	public int mayorDelArray() {
		int mayor = 0;
		if (this.array.length > 0) {
			mayor = this.array[0].getValor();
		}
		for (int i = 1; i < array.length; i++) {
			if (this.array[i].getValor() > mayor) {
				mayor = this.array[i].getValor();
			}
		}
		return mayor;
	}
	
	@Override
	public String toString() {
		return "ArrayEnteros [array=" + Arrays.toString(array) + "]";
	}

	public NumeroEntero[] getArray() {
		return array;
	}

	public void setArray(NumeroEntero[] array) {
		this.array = array;
	}
	
	
}
