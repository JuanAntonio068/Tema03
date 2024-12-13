package parte7;

import java.util.*;

public class Problema07 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la frase
		String frase;

		// Variable donde se va a guardar la palabra
		String palabra;

		// Variable donde se va a guardar el número de veces que se repite la palabra
		int repeticion;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Dime una frase");
		frase = sc.nextLine();

		// Preguntamos al usuario por una palabra
		System.out.println("Dime una palabra");
		palabra = sc.next();

		// Llamamos a la función
		repeticion = contador(frase, palabra);

		// Imprimimos el resultado
		System.out.println("La palabra, " + palabra + ", se repite " + repeticion + " veces");

		// Cerramos el escaner
		sc.close();
	}

	private static int contador(String fraseStr, String palabra) {

		// Variable para ir contando el número de veces que se repite la palabra
		int cont = 0;

		// Array para separar las palabras de la frase
		String[] frase = fraseStr.split(" ");

		// Bucle para ir reccoriendo el array
		for (int i = 0; i < frase.length; i++) {

			// Iniciamos la comparación
			if (frase[i].contains(palabra)) { // La palabra elegida es la misma que la palabra introducida por el
												// usuario
				cont++;
			}
		}
		return cont;
	}
}
