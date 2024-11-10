package parte2;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Tabla donde se van a guardar los números aleatorios
		int tabla[] = new int[30];

		// Declaramos el la clase random
		Random random = new Random();

		// Bucle para asignar un número aleatorio para cada elemento de la tabla
		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = random.nextInt(0, 10);
		}

		// Ordenamos la tabla
		Arrays.sort(tabla);

		// Imprimimos el resultado
		System.out.println(Arrays.toString(tabla));
	}

}
