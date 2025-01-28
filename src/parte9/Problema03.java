package parte9;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Declaramos el conjunto
		TreeMap<Character, Integer> letras = new TreeMap<>();

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde se va a guardar la frase
		String frase;

		// Variable para ir contando cuantas veces sale la letra
		int cont;

		// Variable para guardar una letra
		char letra;

		// Preguntamos al usuario por una frase
		System.out.println("Inserta una frase");
		frase = sc.nextLine();

		// Bucle para ir recorriendo la frase
		for (int i = 0; i < frase.length(); i++) {

			// Reseteamos el valor del contador
			cont = 0;

			letra = frase.charAt(i);

			if (letras.containsKey(letra)) {

			} else {
				if (Character.isLetter(letra)) {
					cont = Collections.frequency(letras, letra);

					letras.put(letra, cont);
				}
			}

		}

		// Imprimimos el resultado
		System.out.println(letras);

		// Cerramos el escaner
		sc.close();
	}

}
