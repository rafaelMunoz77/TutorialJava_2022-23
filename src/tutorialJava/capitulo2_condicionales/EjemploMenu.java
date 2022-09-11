package tutorialJava.capitulo2_condicionales;

import javax.swing.JOptionPane;

public class EjemploMenu {

	public static void main(String[] args) {
		String str;
		int opcion, numero1, numero2;
		
		System.out.println("Menú:");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicación");
		System.out.println("4.- División");
		
		str = JOptionPane.showInputDialog("Introduzca la opción: ");
		opcion = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el primer número: ");
		numero1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el segundo número: ");
		numero2 = Integer.parseInt(str);
		
		
		switch(opcion) {
		case 1:
			System.out.println("La suma vale: " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("La resta vale: " + (numero1 - numero2));
			break;
		}
	}

}
