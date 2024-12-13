package parte7;

import java.util.*;

public class Problema11 {

	public static void main(String[] args) {

		// Array donde se guarda el conjunto 1
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Array donde se guarda el conjunto 2
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Variable para guardar la frase introducida por el usuario
		String frase;

		// Variable donde se va a guardar una letra de la frase
		char letra;

		// Variable donde se guarda la letra descodificada
		char c;

		//Varable donde se guarda la frase descodificada
		String fraseDescod = "";
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Dime una frase");
		frase = sc.nextLine().toLowerCase();

		// Bucle para ir recorriendo la frase
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);

			// Llamamos a la función
			c = descodifica(conjunto2, conjunto1, letra);

			// Añadimos la letra codifica a la frase
			fraseDescod += c;
		}

		// Imprimimos el resultado
		System.out.println("La frase con las letras codificadas es: " + fraseDescod);

		// Cerramos el escaner
		sc.close();
	}

	private static char descodifica(char[] conjunto1, char[] conjunto2, char letra) {

		// Bucle para ir recorriendo lso conjuntos
		for (int i = 0; i < conjunto1.length; i++) {

			if (letra == conjunto1[i]) { // La letra coincide con el elemento actual
				letra = conjunto2[i];
			}
		}
		return letra;
	}
}
