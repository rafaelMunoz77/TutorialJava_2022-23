package tutorialJava.capitulo6_Recursos.creacionEventosOfertasVuelo;

public class Empresa implements OfertaListener {

	@Override
	public void ofertaRecibida(OfertaEvent event) {
		System.out.println("Soy una empresa y he recibido una oferta con precios " +
				event.getPrecioIda() + " - " + event.getPrecioVuelta());		
	}

}
