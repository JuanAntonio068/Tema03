package parte8;

import java.util.*;

public class Problema05 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Conjunto donde se van a guardar los nombres
		LinkedHashSet<String> nombres = new LinkedHashSet<>();

		// Variable donde se va a guardar la respuesta del usuario
		String respuesta;

		do {

			// Preguntamos al usuario por un nombre
			System.out.println("Inserta un nombre");
			respuesta = sc.nextLine();

			if (!respuesta.equalsIgnoreCase("fin")) {
				nombres.add(respuesta);
			}

		} while (!respuesta.equalsIgnoreCase("fin"));

		// Imprimimos el resultado
		System.out.println(nombres);

		// Cerramos el escaner
		sc.close();

	}

}