package parte1;

import java.util.Random;

public class Problema01 {

	public static void main(String[] args) {

		// Declaramos la clase random
		Random random = new Random();

		// Array donde se van a guardar los números aleatorios
		int lista[] = new int[10];

		// En este for se van a asignar los distintos valores para cada elemento
		for (int i = 0; i < lista.length; i++) {

			lista[i] = random.nextInt(1, 101);
		}
		// For-each para imprimir el array
		for (int valor : lista) {

			// Imprimimos el resultado
			System.out.print(valor + " ");
		}
	}

}
