package examenes.arraysConObjetos_AliensVsHumanos;

public class Principal {

	public static void main(String[] args) {
		CampoBatalla campo = new CampoBatalla();
		campo.setNombre("Rute");
		
		campo.mezclarHumanos();
		campo.mezclarMalvados();

		campo.comenzarBatalla();
		
		System.out.println("Malvado más duro: " + campo.getMalvadoMasDuro().toString());
		System.out.println("Malvado más blandito: " + campo.getMalvadoMasBlandito().toString());
		System.out.println("Humano más duro: " + campo.getHumanoMasDuro().toString());
		System.out.println("Humano más blandito: " + campo.getHumanoMasBlandito().toString());
	}

}
