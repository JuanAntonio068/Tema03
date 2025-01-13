package parte7;

import java.util.*;

public class Problema12 {

	public static void main(String[] args) {

		// Variable para guardar una frase
		String frase;

		// Variable donde se va a guardar la palabra más larga
		String palabraLarga = "";

		// Array donde se van a guardar las palabras
		String palabras[];

		// Declaramos el escaner
		Scanner scanner = new Scanner(System.in);

		// Preguntmamos al usuario por una frase
		System.out.println("Ingresa una frase:");
		frase = scanner.nextLine();

		// Separamos la frase en palabras dentro de un array
		palabras = frase.split(" ");

		for (String palabra : palabras) {
			// Comparamos la palabra actual con la palabra más larga encontrada hasta ahora
			if (palabra.length() > palabraLarga.length()) {
				palabraLarga = palabra;
			}
		}
		// Imprimimos el resultado
		System.out.println("La palabra de mayor longitud es: " + palabraLarga);
		System.out.println("Número de caracteres: " + palabraLarga.length());

		// Cerramos el escaner
		scanner.close();
	}

}
