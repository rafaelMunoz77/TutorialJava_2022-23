package tutorialJava.capitulo1;

public class Ejemplo05_OperadoresANivelDeBits {

	public static void main(String[] args) {
	    // Declaración de variables enteras, e inicialización de las mismas.
	    // Llamamos "inicialización de la variable" a la primera vez que
	    // esa variable toma un valor cualquiera en un operador de asignación.
	    // En la siguiente línea de código, se han declarado e inicializado
	    // dos variables.
	    // Por favor, recuerda el significado de "inicialización de variable",
	    // es muy importante y muy utilizado entre programadores.
	    int entero1 = 30, entero2 = 3;

	    // Operación lógica AND. Esta operación, al igual que todas las de
	    // este ejercicio, actua a nivel de los bits que forman el valor
	    // contenido dentro de la variable. En concreto, en este ejemplo,
	    // intervienen el "entero1" toma el valor 30, que presentado en 
	    // binario es 11110, y el "entero2" que toma el valor 3, que en
	    // binario es 00011.
	    // Al aplicar la operación lógica AND, el resultado en binario
	    // queda 00010, que corresponde al número 2 en decimal.
	    System.out.println("Operación lógica AND: " + (entero1 & entero2));
	    
	    // Operación lógica OR. Al igual que antes, partimos del valor
	    // 11110 (30) y del valor 00011 (3). Al aplicar la operación OR,
	    // queda el valor 11111 (31). El carácter "|" se obtiene con la
	    // combinación de "Alt Gr + 1".
	    System.out.println("\nOperación lógica OR: " + (entero1 | entero2));
	    
	    // Operación lógica NOT. Esta operación cambia todos los bits
	    // del valor sobre el que actua. El operador NOT también es
	    // llamado "complemento a uno". 
	    // En DevC, se utilizan 4 Bytes para representar cada entero,
	    // por tanto, ya que 1 Byte = 8 bits, se utilizan 32 bits para
	    // cada valor definido como "int". De esta forma, el valor 30
	    // estará representado como:
	    //        00000000 00000000 00000000 00011110
	    // Al negar quedará:
	    //        11111111 11111111 11111111 11000001
	    // 
	    // En C, los números enteros pueden ser positivos o negativos.
	    // El signo positivo o negativo de un número viene dado por el
	    // bit que tiene situado a su izquierda, de manera que un valor
	    // 0 (cero) indica un número positivo, y un valor 1 (uno) indica
	    // un número negativo. 
	    // Sin embargo, a la hora de imprimir, podemos utilizar el forma-
	    // teador %u, que viene de la palabra "unsigned". Es decir, mos-
	    // mostrará el valor contenido en la variable sin tener en cuenta
	    // que el bit de la izquierda indique un signo o no. De hecho, al
	    // imprimir en forma "unsigned", no podrán existir los números
	    // negativos.
	    // Para escribir en pantalla el símbolo "~", si tienes un teclado
	    // configurado como "Español Tradicional", podrás utilizar la 
	    // combinación "Alt gr + 4", y deberás pulsar el cuatro un par de
	    // veces.
	    System.out.println("\nOperación lógica NOT: " + ~entero1);

	    // Operación lógica XOR. Para escribir en pantalla el símbolo "^", 
	    // si tienes un teclado configurado como "Español Tradicional", 
	    // podrás utilizar la combinación "Mayúsculas + `" (tecla situada
	    // a la izquierda del símbolo "+", y deberás pulsar el ` un par de
	    // veces.
	    System.out.println("\nOperación lógica XOR: " + (entero1 ^ entero2));
	    
	    // Operación de desplazamiento de bits. Si representamos el valor
	    // 30 de la siguiente forma:
	    //       00000000 00000000 00000000 00011110
	    // y desplazamos la "tira de bits" un lugar a la izquierda, ahora
	    // se representará el valor:
	    //       00000000 00000000 00000000 00111100, que corresponde al
	    // valor 60, es decir, hemos multiplicado el número por 2.
	    // Sin embargo, si en lugar de desplazar a la izquierda, se 
	    // desplaza a la derecha, el valor obtenido será:
	    //       00000000 00000000 00000000 00001111, que corresponde al 
	    // valor decimal 15, es decir, se ha dividido entre 2.
	    // Para desplazar, se utilizan los operadores << y >>. De manera que
	    // la expresión:   entero2 << 1, quiere decir que se desplacen un 
	    // lugar a la izquierda los bits de entero2. De esta forma, la 
	    // expresión: entero2 >> 2, quiere decir que se desplacen dos lugares
	    // a la derecha los bits de entero2.
	    System.out.println("\nOperación de desplazamiento izquierda: " + (entero2 << 1));
	    System.out.println("\nOperación de desplazamiento derecha: " + (entero1 >> 2));

	}

}
