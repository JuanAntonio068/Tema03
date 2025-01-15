package parte8;

import java.util.*;

public class Problema01 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Lista donde se van a guardar los numeros
		ArrayList<Integer> numeros = new ArrayList<>();

		// Variable donde se va a guardar la respuesta del usuario
		int respuesta = 0;

		
		do {

			//Preguntamos al usuario por un número
			System.out.println("Dime un número");
			respuesta = sc.nextInt();
			numeros.add(respuesta);
		} while (respuesta > 0);
		
		//Bucle para recorrer la lista
		for (int i = 0; i < numeros.size(); i++) {
			
			
			if (numeros.get(i) % 2 == 0) {//El elemento es par
				//Imprimimos el resultado
				System.out.print(i + " ");
			}
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
