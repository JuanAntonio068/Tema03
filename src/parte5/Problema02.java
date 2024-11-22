package parte5;

import java.util.*;

public class Problema02 {

	public static void main(String[] args) {

		// Matriz donde se va a guardar la matriz traspuesta
		int traspuesta[][] = new int[4][4];

		// Matriz donde se va a guardar los elementos que diga el usuario
		int matriz[][] = new int[4][4];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Bucle para pedir los números para la matiz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				matriz[i][j] = sc.nextInt();
			}
		}
		// Llamamos a la función
		traspuesta = transposición(matriz);

		System.out.println("Tu matriz es esta: ");
		// Bucle para imrpimir la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Está es la matriz traspuesta");
		// Bucle para imprimir la matriz traspuesta
		for (int i = 0; i < traspuesta.length; i++) {
			for (int j = 0; j < traspuesta[0].length; j++) {

				System.out.print(traspuesta[i][j] + "\t");
			}
			System.out.println(" ");
		}

	}

	static int[][] transposición(int[][] matriz) {

		// Matriz donde se va a guardar la matriz traspuesta
		int traspuesta[][] = new int[4][4];

		// Bucle para rellenar la matriz traspuesta
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				traspuesta[j][i] = matriz[i][j];
			}
		}

		return traspuesta;
	}

}
