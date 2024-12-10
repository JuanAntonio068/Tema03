package parte6;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Variable que guarda el número de filas introudicda por el usuario
		int filas;

		// Variable que guarda el número de columnas introudicda por el usuario
		int columnas;

		// Matriz que va a ser desordenada
		int matriz[][];

		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por el número de filas
		System.out.println("Dime el númeero de filas de la matriz");
		filas = sc.nextInt();

		// Preguntamos al usuario por el número de columnas
		System.out.println("Dime el númeero de columnas de la matriz");
		columnas = sc.nextInt();

		matriz = new int[filas][columnas];

		// Bucle para asignar un valor a cada elemento de la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				matriz[i][j] = sc.nextInt();
			}
		}

		// Llamamos a la función
		desordenarMatriz(matriz);

		// Bucle para imprimir la matriz
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + "\t");
			}
			System.out.println(" ");
		}

		// Cerramos el escaner
		sc.close();
	}

	public static void desordenarMatriz(int[][] matriz) {

		// Variable para guardar una posicion aleatoria en las filas
		int randomPosition1;

		// Variable para guardar una posicion aleatoria en las columnas
		int randomPosition2;

		// Variable temporal para guardar el valor actual de la tabla
		int temp;

		// Declaramos la clase random
		Random rand = new Random();

		// Bucle para desordenar la matriz
		for (int i = 0; i < matriz.length; i++) {

			randomPosition1 = rand.nextInt(0, matriz.length);
			for (int j = 0; j < matriz[0].length; j++) {

				randomPosition2 = rand.nextInt(0, matriz[0].length);
				temp = matriz[i][j];
				matriz[i][j] = matriz[randomPosition1][randomPosition2];
				matriz[randomPosition1][randomPosition2] = temp;
			}
		}
	}
}
