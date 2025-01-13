package parte7;

import java.util.*;

public class Problema13 {

	public static void main(String[] args) {

		// Variable para guardar la primera palabra
		String palabra1;

		// Variable para guardar la segunda palabra
		String palabra2;

		// Variable para saber si son anagramas
		boolean sonAnagramas;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una palabra
		System.out.println("Ingresa la primera palabra:");
		palabra1 = sc.next();

		// Preguntamos al usuario por otra palabra
		System.out.println("Ingresa la segunda palabra:");
		palabra2 = sc.next();

		// Llamamos a la función
		sonAnagramas = sonAnagramas(palabra1, palabra2);

		// Imprimimos el resultado
		System.out.println((sonAnagramas) ? "La palabra " + palabra1 + " y la palabra " + palabra2 + " son anagramas"
				: "La palabra " + palabra1 + " y la palabra " + palabra2 + " no son anagramas");

		// Cerramos el escaner
		sc.close();
	}

	public static boolean sonAnagramas(String palabra1, String palabra2) {
		// Pasamos las palabras a minusculas
		palabra1 = palabra1.toLowerCase();
		palabra2 = palabra2.toLowerCase();

		// Pasamos la palabras a Arrays
		char[] tabla1 = palabra1.toCharArray();
		char[] tabla2 = palabra2.toCharArray();

		// Ordenamos los arrays
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);

		// Devolvemos la comparación
		return Arrays.equals(tabla1, tabla2);

	}
}
