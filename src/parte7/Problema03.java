package parte7;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la frase
		String frase;

		// Variable donde se va a guardar el número de espacios
		int espacios;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario una frase
		System.out.println("Dime una frase");
		frase = sc.nextLine();

		// Llamamos a la función
		espacios = contEspacios(frase);

		// Imprimimos el resultado
		System.out.println("La frase que has escrito tiene " + espacios + " espacios");

		// Cerramos el escaner
		sc.close();
	}

	static int contEspacios(String frase) {

		// Variable donde se va a guardar el número de espacios
		int espacios = 0;

		
		
		// Bucle para ir recorriendo la frase
		for (int i = 0; i < frase.length(); i++) {

			// Comprobamos que haya un espacio
			if (frase.charAt(i) == ' ') { // Hay un espacio
				espacios++;

			}
		}
		return espacios;
	}
}
