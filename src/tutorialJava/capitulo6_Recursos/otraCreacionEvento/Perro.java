package tutorialJava.capitulo6_Recursos.otraCreacionEvento;

public class Perro implements PalabraMagicaIntroducidaListener{

	String nombre;
	
	public Perro (String nombre) {
		this.nombre = nombre;
		Principal.addPalabraMagicaIntroducidaListener(this);
	}
	
	@Override
	public void palabraMagicaIntroducida(PalabraMagicaIntroducidaEvent event) {
		System.out.println("Soy " + this.nombre + " y he escuchado la palabra: " + event.getPalabraIntroducida());
	}

}
