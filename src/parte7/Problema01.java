package parte7;

import java.util.*;

public class Problema01 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde va a estar la primera frase
		String frase1;

		// Variable donde va a estar la segunda frase
		String frase2;

		// Preguntamos al usuario por una frase
		System.out.println("Dime una frase");
		frase1 = sc.nextLine();

		// Preguntamos al usuario por otra frase
		System.out.println("Dime otra frase");
		frase2 = sc.nextLine();

		// Iniciamos la comparación
		if (frase1.length() > frase2.length()) { // La segunda frase es más corta
			System.out.println("La segunda frase es la más corta");

		} else if (frase1.length() < frase2.length()) { // La primera frase es más corta
			System.out.println("La primera frase es la más corta");

		} else { // Las dos frases tienen la misma longitud
			System.out.println("Las dos frases tienen el mismo número de caracteres");
		}

		// Cerramos el escaner
		sc.close();
	}

}
