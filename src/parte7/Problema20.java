package parte7;

import java.util.Scanner;

public class Problema20 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la palabra
		String palabra;

		// Variable donde se va a guardar el valor de n
		int n;

		// Array donde van a ir las secuencias cortadas en n partes
		String[] secuencias;

		// Declaramos el escaner
		Scanner scanner = new Scanner(System.in);

		// Preguntamos al usuario por una palabra
		System.out.println("Ingresa una palabra:");
		palabra = scanner.next();

		// Preguntamos al usuario por el valor de n
		System.out.println("Ingresa el valor de n:");
		n = scanner.nextInt();

		// Llamamos a la función
		secuencias = dividirEnSecuencias(palabra, n);

		// Imprimimos el resultado
		for (int i = 0; i < secuencias.length; i++) {
			System.out.println(secuencias[i]);
		}
		// Cerramos el escaner
		scanner.close();
	}

	public static String[] dividirEnSecuencias(String palabra, int n) {

		// Variable donde calculamos el numero de subcadenas que van a surgir
		int numSecuencias = (palabra.length() + n - 1) / n;

		// Array donde va a ir todos las secuencias juntas
		String[] resultado = new String[numSecuencias];

		// Array para calcular el inicio de la subcadena
		int inicio;

		// Array para calcular el final de la subcadena
		int fin;

		for (int i = 0; i < numSecuencias; i++) {
			inicio = i * n;
			fin = inicio + n;
			if (fin > palabra.length()) {
				fin = palabra.length();
			}
			resultado[i] = palabra.substring(inicio, fin);
		}
		return resultado;
	}

}
