package parte2;

import java.util.*;

public class Problema04 {

	public static void main(String[] args) {

		// Tabla donde se van a guardar las puntuaciones
		Integer puntuaciones[] = new Integer[8];

		// Variable para permitir la salida del bucle
		boolean error = false;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < puntuaciones.length; i++) {

			do {
				try {
					error = false;
					// Preguntamos al usuario por la puntuación
					System.out.println("Dime la puntuación");
					puntuaciones[i] = sc.nextInt();
					// Nos aseguramos que el valor sea el correcto
					assert puntuaciones[i] >= 1000 && puntuaciones[i] <= 2800 : "Introduce un valor válido";

				} catch (AssertionError e) {
					// Imrpimimos el mensaje
					System.out.println(e.getMessage());

					error = true;
				} finally {
					// Limpiasmos el escaner
					sc.nextLine();
				}

			} while (error);

		}
		
		// Ordenamos la tabla de forma descendente
		Arrays.sort(puntuaciones, Collections.reverseOrder());

		// Imprimos el resultado
		System.out.println(Arrays.toString(puntuaciones));
		
		//Cerramos el escaner
		sc.close();
	}

}
