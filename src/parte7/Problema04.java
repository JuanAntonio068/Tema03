package parte7;

import java.util.*;

public class Problema04 {

	public static void main(String[] args) {

		// Variable donde se va a guardar una frase
		String frase;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Dime una frase");
		frase = sc.nextLine();

		// Llamamos la función
		frase = invertir(frase);

		// Imprimimos el resultado
		System.out.println("La frase invertida es: " + frase);

		// Cerramos el escaner
		sc.close();
	}

	private static String invertir(String frase) {

		// Array donde se va a guardar la frase invertida en caracteres en char
		char[] inversa = new char[frase.length()];

		// Contador para ir recorriendo la frase
		int cont = frase.length() - 1;

		//Variable donde se va a guardar la frase invertida
		String inversaStr;
		
		//Bucle donde se va a invertir la frase
		for (int i = 0; i < inversa.length; i++) {

			inversa[i] = frase.charAt(cont);
			
			cont--;
		}

		inversaStr = String.valueOf(inversa);
		
		return inversaStr;
	}
}
