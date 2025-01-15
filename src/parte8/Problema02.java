package parte8;

import java.util.*;

public class Problema02 {

	public static void main(String[] args) {

		// Declaramos la clase random
		Random rand = new Random();

		// Variable donde se va a guardar la suma
		int suma = 0;

		// Variable donde se va a guardar la media
		double media;

		// Variable donde se va a guardar el máximo
		int maximo = Integer.MIN_VALUE;

		// Variable donde se va a guardar el minimo
		int minimo = Integer.MAX_VALUE;

		// Variable para marcar el tamaño de la lista
		int tamaño = rand.nextInt(5, 11);

		// Lista donde se van a guardar los números aleatorios
		ArrayList<Integer> numerosAleatorios = new ArrayList<>();

		// Bucle para rellenar la lista
		for (int i = tamaño; i > 0; i--) {

			numerosAleatorios.add(rand.nextInt(0, 101));
		}

		// Bucle para recorrer la lista
		for (int i = 0; i < numerosAleatorios.size(); i++) {

			suma += numerosAleatorios.get(i);

			if (numerosAleatorios.get(i) > maximo) { // El elemento acutal es mayor al máximo actual
				maximo = numerosAleatorios.get(i);
			}
			if (numerosAleatorios.get(i) < minimo) { // El elemento acutal es menor al mínimo actual
				minimo = numerosAleatorios.get(i);
			}
		}

		media = (double) suma / numerosAleatorios.size();

		// Imprimimos el resultado
		System.out.println("La lista es: " + numerosAleatorios);
		System.out.println("La suma de todos los elementos es: " + suma);
		System.out.println("La media de todos los elementos es: " + media);
		System.out.println("El máximo es: " + maximo);
		System.out.println("El mínimo es: " + minimo);
	}

}
