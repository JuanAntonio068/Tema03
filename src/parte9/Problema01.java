package parte9;

import java.util.*;

public class Problema01 {

	public static void main(String[] args) {

		// Declaramos el arraylist
		ArrayList<Integer> numeros = new ArrayList<>();

		// For para rellenar la lista
		for (int i = 1; i <= 10; i++) {
			numeros.add(i);
		}

		// Imprimimos la lista original
		System.out.println(numeros);

		// La desordenamos
		Collections.shuffle(numeros);

		// Imprimimos la lista desordenada
		System.out.println(numeros);
	}

}
