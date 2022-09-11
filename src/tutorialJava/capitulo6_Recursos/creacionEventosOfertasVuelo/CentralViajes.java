package tutorialJava.capitulo6_Recursos.creacionEventosOfertasVuelo;

import java.util.ArrayList;
import java.util.List;

public class CentralViajes {

	private static List<OfertaListener> listeners = new ArrayList<OfertaListener>();
	
	/**
	 * 
	 * @param l
	 */
	public static void addOfertaListener (OfertaListener l) {
		listeners.add(l);
	}

	/**
	 * 
	 * @param l
	 */
	public static void removeOfertaListener (OfertaListener l) {
		listeners.remove(l);
	}

	/**
	 * 
	 */
	public static void fireNewOfertaEvent() {
		OfertaEvent oe = new OfertaEvent();
		oe.setPrecioIda(150);
		oe.setPrecioVuelta(10);
		for (OfertaListener ol : listeners) {
			ol.ofertaRecibida(oe);
		}
	}
	
}
