package parte7;

import java.util.Random;
import java.util.Scanner;

public class Problema15 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde se va a guardar la frase o palabra escrita por el jugador 1
		String frase;

		// Variable donde se va a guardar la frase desordenada
		String fraseDesordenada;

		// Variable donde se va a guardar la frase o palabra escrita por el jugador 2
		String jugador2;

		// Bucle del que no se puede salir hasta que la variable frase no este vacía
		do {
			// Preguntamos al jugador 1 por una palabra o frase
			System.out.println("Jugador 1, ingresa una palabra o frase:");
			frase = sc.nextLine();
		} while (frase.isEmpty());

		// Llamamos a la función
		fraseDesordenada = desordenarTexto(frase);

		// Le mostramos la pista al jugador2
		System.out.println("Pista para el Jugador 2: " + fraseDesordenada);

		// Preguntamos al usuario por el texto original
		System.out.println("Jugador 2, ¿cuál es el texto original?");
		jugador2 = sc.nextLine();

		if (jugador2.equalsIgnoreCase(frase)) {// El jugador 2 ha acertado
			System.out.println("¡Correcto! El texto original es: " + frase);
		} else {// El jugador 2 ha fallado
			System.out.println("Incorrecto. El texto original era: " + frase);
		}
		//Cerramos el escaner
		sc.close();
	}

	public static String desordenarTexto(String frase) {

		//Variable para guardar una posición aleatoria
		int posicionAleatoria;

		//Variable auxiliar para guardar la letra acutal
		char aux;

		//Array donde va a ir el texto separado en caracteres
		char[] caracteres = frase.toCharArray();

		//Variable donde se va a guardar la frase desordenada
		String fraseDesordenada;

		//Declaramos la clase random
		Random rand = new Random();

		for (int i = 0; i < caracteres.length; i++) {
			posicionAleatoria = rand.nextInt(0, caracteres.length);
			aux = caracteres[i];
			caracteres[i] = caracteres[posicionAleatoria];
			caracteres[posicionAleatoria] = aux;
		}
		fraseDesordenada = caracteres.toString();

		//Devolvemos el resultado
		return fraseDesordenada;
	}

}
