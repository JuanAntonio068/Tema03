package parte7;

import java.util.*;

public class Problema10 {

	public static void main(String[] args) {

		// Array donde se guarda el conjunto 1
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Array donde se guarda el conjunto 2
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Variable para guardar la frase introducida por el usuario
		String frase;

		// Variable donde se va a guardar una letra de la frase
		char letra;

		// Variable donde se guarda la letra codificada
		char c;

		// Varable donde se guarda la frase codificada
		String fraseCod = "";

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Dime una frase");
		frase = sc.nextLine().toLowerCase();

		// Bucle para ir recorriendo la frase
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);

			// Llamamos a la función
			c = codifica(conjunto1, conjunto2, letra);

			// Añadimos la letra codifica a la frase
			fraseCod += c;
		}

		// Imprimimos el resultado
		System.out.println("La frase con las letras codificadas es: " + fraseCod);

		// Cerramos el escaner
		sc.close();
	}

	private static char codifica(char[] conjunto1, char[] conjunto2, char letra) {

		// Variable para marcar la salida del bucle
		boolean salida = false;

		// Bucle para ir recorriendo lso conjuntos
		for (int i = 0; i < conjunto1.length && !salida; i++) {

			if (letra == conjunto1[i]) { // La letra coincide con el elemento actual
				letra = conjunto2[i];
				salida = true;
			}
		}
		return letra;
	}
}
