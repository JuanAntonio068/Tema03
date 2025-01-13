package parte7;

import java.util.Scanner;

public class Problema19 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la frase introducida por el usuario
		String frase;

		// Variable donde se va a guardar la frase pasada a camelCase
		String camelCase;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Ingresa una frase:");
		frase = sc.nextLine();

		// Llamamos a la función
		camelCase = convertirACamelCase(frase);

		// Imprimimos el resultado
		System.out.println("CamelCase: " + camelCase);

		// Cerramos el escaner
		sc.close();
	}

	public static String convertirACamelCase(String frase) {

		// Array donde se separa la frase por palabras quitando los espacios y pasando
		// todo a minuscula
		String[] palabras = frase.toLowerCase().split(" ");

		// Variable donde se guarda la frase pasada a camelCase
		String camelCase = palabras[0];

		// Variable donde se va a ir guardando palabra por palabra
		String palabra;

		for (int i = 1; i < palabras.length; i++) {
			palabra = palabras[i];

			// Se pone en mayusculas la primera letra de la palabra y las demas en
			// minusculas
			camelCase += Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
		}
		return camelCase;
	}

}
