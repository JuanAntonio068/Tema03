package parte8;

import java.util.*;

public class Problema04 {

	public static void main(String[] args) {

		// Declaramos la clase random
		Random rand = new Random();

		// Lista donde se van a guardar los números
		TreeSet<Integer> numerosAleatorios = new TreeSet<>();

		// Bucle para ir rellenando la lista
		for (int i = 20; i > 0; i--) {

			numerosAleatorios.add(rand.nextInt(1, 100));
		}

		// Imprimimos el rsultado
		System.out.println(numerosAleatorios);
	}

}
