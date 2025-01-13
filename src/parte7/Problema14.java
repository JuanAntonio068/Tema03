package parte7;

import java.util.Scanner;

public class Problema14 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la frase
		String frase;

		// Array para contar las letras
		int[] contadorLetras = new int[26];

		// Variable para guardar la letra actual y compararla
		char letra;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Ingresa una frase:");
		frase = sc.nextLine().toLowerCase();

		// Bucle para ir contando las letras
		for (int i = 0; i < frase.length(); i++) {

			letra = frase.charAt(i);

			if (letra >= 'a' && letra <= 'z') {
				contadorLetras[letra - 'a']++;
			}
		}
		// Imprimimos el resultado
		for (int i = 0; i < 26; i++) {
			if (contadorLetras[i] > 0) {
				System.out.println((char) (i + 'a') + ": " + contadorLetras[i] + " vez/veces");
			}
		}
		// Cerramos el escaner
		sc.close();
	}

}
