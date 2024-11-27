package Parte6;

import java.util.*;

public class Problema02 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la longitud introducida por el usuario
		int longitud;

		// Tabla que se va a ordenar
		int tabla[];

		// Declaramos el esacaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por la longitud
		System.out.println("Dime la longitud de la tabla");
		longitud = sc.nextInt();

		tabla = new int[longitud];

		// Bucle para asiganr un valor a cada elemento de la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Preguntamos al usuario por número
			System.out.println("Dime un número");
			tabla[i] = sc.nextInt();

		}
		//Llamamos a la función
		tabla = desordenarTabla(tabla);
		
		//Impriimos el resultado
		System.out.println("La tabla desordenada es: " + Arrays.toString(tabla));
		
		// Cerrmos el escaner
		sc.close();
	}

	static int[] desordenarTabla(int[] tabla) {

		// Variable para guardar una posicion aleatoria
		int randomPosition;

		// Variable temporal para guardar el valor actual de la tabla
		int temp;
		// Declaramos la clase random
		Random rand = new Random();

		// Bucle para desordenar la tabla
		for (int i = 0; i < tabla.length; i++) {
			randomPosition = rand.nextInt(0, tabla.length);
			temp = tabla[i];
			tabla[i] = tabla[randomPosition];
			tabla[randomPosition] = temp;
		}
		return tabla;
	}

}
