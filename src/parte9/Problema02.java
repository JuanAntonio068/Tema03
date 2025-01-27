package parte9;

import java.util.*;

public class Problema02 {

	public static void main(String[] args) {

		// Declaramos el LinkedHashSet
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

		// Declaramos la clase random
		Random rand = new Random();

		// Variable donde se va a guardar un número aleatorio
		int numAleatorio;
		
		// Bucle para rellenar el conjunto
		for (int i = 0; i < 10; i++) {
			
			numAleatorio = rand.nextInt(1,20);
			
			numeros.add(numAleatorio);
		}
		
		//Imprimimos el resultado
		System.out.println(numeros);
	}

}
