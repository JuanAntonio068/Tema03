package parte8;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Declaramos la clase random
		Random rand = new Random();

		// Lista donde se van a guardar los números aleatorios
		ArrayList<Integer> numerosAleatorios = new ArrayList<>();

		// Bucle para rellenar la lista
		for (int i = 30; i > 0; i--) {
			numerosAleatorios.add(rand.nextInt(1, 11));
		}
		
		//Ordenamos la lista
		Collections.sort(numerosAleatorios);
		
		//Imprimimos el resultado
		System.out.println(numerosAleatorios);
	}

}
