package parte8;

import java.util.*;

public class Problema04 {

	public static void main(String[] args) {

		// Declaramos la clase random
		Random rand = new Random();

		// Lista donde se van a guardar los números
		ArrayList<Integer> numerosAleatorios = new ArrayList<>();

		// Bucle para ir rellenando la lista
		for (int i = 20; i > 0; i--) {

			numerosAleatorios.add(rand.nextInt(Integer.MIN_VALUE, 10));

			// Ordenamos la lista
			Collections.sort(numerosAleatorios);
		}

		// Imprimimos el rsultado
		System.out.println(numerosAleatorios);
	}

}
