package parte9;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Declaramos el conjunto
		TreeMap<Character, Integer> contLetras = new TreeMap<>();

		// Declaramos la lista
		ArrayList<Character> letras = new ArrayList<>();

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
		frase = sc.nextLine().toUpperCase();

		// Bucle para ir rellenando el arrayList
		for (int i = 0; i < frase.length(); i++) {

			letra = frase.charAt(i);

			// Nos aseguramos de que sea una letra
			if (Character.isLetter(letra)) {

				letras.add(letra);
			}

		}

		// Bucle para ir recorriendo la lista
		for (int i = 0; i < letras.size(); i++) {

			// Reseateamos el contador
			cont = 0;

			// Con el frequency sacamos cuantas veces aparece cada letra
			cont = Collections.frequency(letras, letras.get(i));

			// Añadimos la letra más las veces que aparece en el TreeMap
			contLetras.put(letras.get(i), cont);
		}
		// Imprimimos el resultado
		System.out.println(contLetras);

		// Cerramos el escaner
		sc.close();
	}

}
