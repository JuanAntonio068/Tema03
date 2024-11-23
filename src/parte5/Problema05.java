package parte5;

import java.util.*;

public class Problema05 {

	public static void main(String[] args) {

		// Matriz donde se va a guardar los elementos que escriba el usuario
		int matriz[][];

		// Variable para guardar el número de filas y columnas de la matriz
		int n;

		// Matriz donde se va a guardar la tabla girada
		int tablaGirada[][];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por el número de filas y columnas
		System.out.println("Dime el número de filas y columnas de la matriz");
		n = sc.nextInt();

		matriz = new int[n][n];

		// Bucle para asignar valores a caada elemento de la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				matriz[i][j] = sc.nextInt();
			}
		}
		//Llamamos a la función
		tablaGirada = gira90(matriz);
		
		//Bucle para imprimir la matriz girada
		for (int[] fila: tablaGirada) {
			for (int elemento : fila) {
				System.out.print(elemento + "\t");
			}
			System.out.println(" ");
		}
		
		// Cerramos el escaner
		sc.close();
	}

	static int[][] gira90(int matriz[][]) {

		// Matriz donde se va a guardar la tabla girada
		int gira90[][] = new int[matriz.length][matriz.length];

		//Bucle donde se va a girar la matriz
		for (int i = 0; i < gira90.length; i++) {
			for (int j = 0; j < gira90.length; j++) {
				gira90[j][gira90.length - 1 - i] = matriz[i][j];
			}
		}
		return gira90;
	}
}
