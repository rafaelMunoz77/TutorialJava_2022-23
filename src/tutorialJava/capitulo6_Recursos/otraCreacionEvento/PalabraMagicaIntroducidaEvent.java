package tutorialJava.capitulo6_Recursos.otraCreacionEvento;

public class PalabraMagicaIntroducidaEvent {
	private String palabraIntroducida;
	
	public PalabraMagicaIntroducidaEvent (String palabraIntroducida ) {
		this.palabraIntroducida = palabraIntroducida;
	}

	public String getPalabraIntroducida() {
		return palabraIntroducida;
	}
	
	
}
