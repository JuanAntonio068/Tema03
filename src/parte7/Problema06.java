package parte7;

import java.util.*;

public class Problema06 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la frase
		String frase;

		// Variable para saber si es palíndroma
		boolean palindroma;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Dime una frase");
		frase = sc.nextLine();

		// Llamamos a la función
		palindroma = palindroma(frase);

		// Imprimimos el resultado
		System.out.println((palindroma) ? "La frase es palíndroma" : "La frase no es palíndroma");

		// Cerramos el escaner
		sc.close();
	}

	private static boolean palindroma(String frase) {

		// Variable para saber si es palindroma
		boolean palindroma = false;

		// Array donde se va a guardar la frase invertida en caracteres en char
		char[] inversa = new char[frase.length()];

		// Contador para ir recorriendo la frase
		int cont = frase.length() - 1;

		// Variable donde se va a guardar la frase invertida
		String inversaStr;

		// Bucle donde se va a invertir la frase
		for (int i = 0; i < inversa.length; i++) {

			inversa[i] = frase.charAt(cont);

			cont--;
		}

		inversaStr = String.valueOf(inversa);

		// Quitamos los espacios de las frases
		frase = frase.replace(" ", "");
		inversaStr = inversaStr.replace(" ", "");

		// Iniciamos la comparación
		palindroma = (frase.equalsIgnoreCase(inversaStr) ? true : false);

		return palindroma;
	}
}
