package parte7;

import java.util.*;

public class Problema08 {

	public static void main(String[] args) {

		// Variable donde el usuario va escribir una frase
		String fraseStr;

		// Array donde se guarda la frase separando las palabras en cada elemento del
		// array
		String frase[];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Dime una frase");
		fraseStr = sc.nextLine().toLowerCase();

		// Pasamos la frase a un array
		frase = fraseStr.split(" ");

		// Ordenamos el array
		Arrays.sort(frase);

		// Imprimimos el resultado
		System.out.println("La frase ordenada alfabéticamente es: " + Arrays.toString(frase));

		// Cerramos el escaner
		sc.close();
	}

}
