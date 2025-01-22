package parte8;

import java.util.*;

public class Problema07 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos un TreeMap para añadir las parejas
		TreeMap<String, String> diccionario = new TreeMap<>();

		// Variable que va a guardar la elección del usuario
		int eleccion;

		// Variable que va a pedir una palabra en español
		String español;

		// Variable que va a pedir una palabra en inglés
		String ingles;

		// Anadimos las parejas de palabras al diccionario
		diccionario.put("COCHE", "CAR");
		diccionario.put("CASA", "HOUSE");
		diccionario.put("PERRO", "DOG");
		diccionario.put("GATO", "CAT");
		diccionario.put("ESPOSA", "WIFE");
		diccionario.put("MARIDO", "HUSBAND");
		diccionario.put("SACO", "BUNDLE");
		diccionario.put("ORDENADOR", "COMPUTER");
		diccionario.put("PANTALLA", "SCREEN");
		diccionario.put("MESA", "TABLE");
		diccionario.put("HORA", "HOUR");
		diccionario.put("CAMISETA", "T-SHIRT");
		diccionario.put("CAPA", "CLOAK");
		diccionario.put("TECLADO", "KEYBOARD");
		diccionario.put("GUITARRA", "GUITAR");
		diccionario.put("PENSAR", "THINK");
		diccionario.put("MAESTRO", "TEACHER");
		diccionario.put("FUEGO", "FIRE");
		diccionario.put("HIELO", "ICE");
		diccionario.put("LLAVE", "KEY");

		// Preguntamos al usuario por una opcion
		System.out.println("1. Inserta palabra");
		System.out.println("2. Busca palabra");
		System.out.println("0. Salir");
		eleccion = sc.nextInt();

		while (eleccion > 0) {

			// El usuario ha elegido insertar una palabra
			if (eleccion == 1) {

				// Preguntamos por la palabra que quiere introducir
				System.out.println("Dime la palabra en español");
				español = sc.next().toUpperCase();

				// Preguntamos por la traducción
				System.out.println("Dime la traducción al inglés");
				ingles = sc.next().toUpperCase();

				// Añadimos las respuestas al diccionario
				diccionario.put(español, ingles);

			} else if (eleccion == 2) {

				// Pedimos la palabra en español
				System.out.println("Inserta una palabra en español");
				español = sc.next().toUpperCase();

				// Buscamos la palabra en el diccionario y devolvemos la traducción
				System.out.println("La traducción es: " + diccionario.get(español));
			}
			// Preguntamos al usuario por una opcion
			System.out.println("1. Inserta palabra");
			System.out.println("2. Busca palabra");
			System.out.println("0. Salir");
			eleccion = sc.nextInt();
		}

		// Cerramos el escaner
		sc.close();
	}

}
