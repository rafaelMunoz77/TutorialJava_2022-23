package tutorialJava.capitulo6_Recursos.excepciones;

public class EjemploLanzamientoExcepcionPropia {

	/**
	 * 
	 * @param persona
	 * @return
	 * @throws PersonaNulaException
	 * @throws PiernaNulaException
	 */
	private static String personaToString (Persona persona) throws PersonaNulaException, PiernaNulaException {
		StringBuffer sb = new StringBuffer();
		// A partir de una persona, vamos a construir un StringBuffer que recorra sus dos piernas
		if (persona == null) {
			throw new PersonaNulaException("El objeto persona es null");
		}
		else {
			sb.append("El objeto persona tiene dos piernas: ");
			
			if (persona.getPiernaDerecha() == null) {
				throw new PiernaNulaException("La pierna derecha del objeto persona es null");
			}
			else {
				sb.append("la derecha ");
				
				if (persona.getPiernaIzquierda() == null) {
					throw new PiernaNulaException("La pierna izquierda del objeto persona es null");
				}
				else {
					sb.append("y la izquierda.");
				}
			}
		}
		
		return sb.toString();
	}
	
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Persona persona = new Persona(new Pierna(Pierna.DERECHA), new Pierna(Pierna.IZQUIERDA));
//			Persona persona = null;
//			Persona persona = new Persona(null, new Pierna(Pierna.IZQUIERDA));
//			Persona persona = new Persona(new Pierna(Pierna.DERECHA), null);
			System.out.println(personaToString(persona));
		} catch (PersonaNulaException e) {
			System.out.println("Existen valores nulos en el objeto persona: " + e.getMessage());
		} catch (PiernaNulaException e) {
			System.out.println("Existen valores nulos en el objeto persona: " + e.getMessage());
		}

	}

}
