package parte4;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Tabla donde se van a guardar los pares
		int pares[];

		// Variable donde vamos a preguntar la longitud
		int longitud;

		// Variable donde vamosa perguntar el número final
		int fin;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por la longitud
		System.out.println("Dime la longitud de la tabla");
		longitud = sc.nextInt();

		// Preguntamos al usario por el número final
		System.out.println("Dime el número final para la tabla");
		fin = sc.nextInt();

		// Llamamos a la función
		pares = rellenaPares(longitud, fin);

		// Imprimimos el resultado
		System.out.println(Arrays.toString(pares));

		// Cerramos el escaner
		sc.close();
	}

	// Funcion para rellenar cada valor de la tabla con un número par
	static int[] rellenaPares(int longitud, int fin) {

		// Declaramos la clase random
		Random rand = new Random();

		// Variable para poner un número aleatorio
		int par;

		// Tabla donde se van a guardar los números pares
		int pares[] = new int[longitud];

		// Bucle para asignar los valores a cada elemento
		for (int i = 0; i < pares.length; i++) {

			do {

				par = rand.nextInt(2, fin + 1);

			} while (par % 2 != 0);

			pares[i] = par;
		}

		// Devolvemos la tabla
		return pares;
	}
}
