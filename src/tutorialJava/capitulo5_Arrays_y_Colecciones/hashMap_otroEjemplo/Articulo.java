package tutorialJava.capitulo5_Arrays_y_Colecciones.hashMap_otroEjemplo;

public class Articulo {

	private String codigo;
	private String nombre;
	private String codEstante;
	private int unidadesStock;
	
	public Articulo() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param codEstante
	 * @param unidadesStock
	 */
	public Articulo(String codigo, String nombre, String codEstante, int unidadesStock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.codEstante = codEstante;
		this.unidadesStock = unidadesStock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodEstante() {
		return codEstante;
	}

	public void setCodEstante(String codEstante) {
		this.codEstante = codEstante;
	}

	public int getUnidadesStock() {
		return unidadesStock;
	}

	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", codEstante=" + codEstante + ", unidadesStock="
				+ unidadesStock + "]";
	}

	
	
}
