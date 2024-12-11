package parte7;

import java.util.*;

public class Problema05 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la palabra introducida por el usuario
		String palabra;

		// Variable donde se va a guardar la frase completa
		String frase = "";

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una palabra
		System.out.println("Dime una palabra");
		palabra = sc.next();

		// Bucle donde se va a ir formando la frase
		while (!(palabra.equalsIgnoreCase("fin"))) {

			frase += palabra + " ";

			// Preguntamos otra vez al usuario
			System.out.println("Dime otra palabra");
			palabra = sc.next();
		}

		// Imprimimos el resultado
		System.out.println("La frase es: " + frase);

		// Cerramos el escaner
		sc.close();
	}

}
