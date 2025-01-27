package parte8;

import java.util.*;

public class Problema09 {

	public static void main(String[] args) {

		// TreeMap donde van a ir los números
		TreeMap<Integer, Integer> numeros = new TreeMap<>();

		// TreeMap donde van a ir las estrellas
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		// Declaramos el escaner
		Scanner scanner = new Scanner(System.in);

		// Variable donde se va a guardar el número introducido por el usuario
		int numero;

		// Variable donde se va a guardar el número introducido por el usuario
		int estrella;

		// Pedir al usuario que introduzca los 5 números del último sorteo
		System.out.println("Introduce los 5 números del último sorteo:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numero = scanner.nextInt();
			if (numeros.containsKey(numero)) { // Comprobar si el número ya está en la colección
				numeros.put(numero, numeros.get(numero) + 1); // Incrementar el valor en 1 si ya está en la colección
			} else {
				numeros.put(numero, 1); // Añadir el número a la colección con un valor de 1 si no está en la colección
			}
		}

		// Pedir al usuario que introduzca las 2 estrellas del último sorteo
		System.out.println("Introduce las 2 estrellas del último sorteo:");
		for (int i = 0; i < 2; i++) {
			System.out.print("Estrella " + (i + 1) + ": ");
			estrella = scanner.nextInt();
			if (estrellas.containsKey(estrella)) { // Comprobar si la estrella ya está en la colección
				estrellas.put(estrella, estrellas.get(estrella) + 1); // Incrementar el valor en 1 si ya está en la
																		// colección
			} else {
				estrellas.put(estrella, 1); // Añadir la estrella a la colección con un valor de 1 si no está en la
											// colección
			}
		}

		// Mostrar la frecuencia de cada número en orden
		System.out.println("\nFrecuencia de Números:");
		for (Integer key : numeros.keySet()) { // Iterar sobre las claves del TreeMap de números
			System.out.println("Número " + key + ": " + numeros.get(key)); // Mostrar el número y su frecuencia
		}

		// Mostrar la frecuencia de cada estrella en orden
		System.out.println("\nFrecuencia de Estrellas:");
		for (Integer key : estrellas.keySet()) { // Iterar sobre las claves del TreeMap de estrellas
			System.out.println("Estrella " + key + ": " + estrellas.get(key)); // Mostrar la estrella y su frecuencia
		}
		// Cerramos el escaner
		scanner.close();
	}

}
