package examenes.arraysConObjetos_Baraja;

public class Carta {
	private String palo;
	private int valor;
	private int id;
	/**
	 * 
	 */
	public Carta() {
		super();
	}
	/**
	 * @param palo
	 * @param valor
	 * @param id
	 */
	public Carta(String palo, int valor, int id) {
		super();
		this.palo = palo;
		this.valor = valor;
		this.id = id;
	}
	/**
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}
	/**
	 * @param palo the palo to set
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}
	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Carta " + this.id + ": " + valor + palo + " ";
	}
	
	
}
