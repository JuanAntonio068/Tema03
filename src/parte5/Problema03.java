package parte5;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Variable para verificar si la matriz es simétrica
		boolean simetrica;

		// Llamamos a la función
		int matriz[][] = construirMatriz();

		simetrica = verificacion(matriz, 0, 0);

		System.out.println((simetrica) ? "La matriz es simétrica" : "La matriz no es simétrica");
	}

	static int[][] construirMatriz() {

		// Matriz donde se va a guardar los elementos que escriba el usuario
		int matriz[][];

		// Variable para guardar el número de filas de la matriz
		int filas;

		// Variable para guardar el número de columnas de la matriz
		int columnas;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por el número de filas
		System.out.println("Dime el número de filas de la matriz");
		filas = sc.nextInt();

		// Preguntamos al usuario por el número de columnas
		System.out.println("Dime el número de columnas");
		columnas = sc.nextInt();

		matriz = new int[filas][columnas];

		// Bucle para asignar valores a caada elemento de la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				matriz[i][j] = sc.nextInt();
			}
		}

		// Cerramos el escaner
		sc.close();

		return matriz;
	}

	static boolean verificacion(int[][] matriz, int filas, int columnas) {

		// Bucle para rellenar la matriz traspuesta
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					return false;
				}

			}
		}
		return true;
	}
}
