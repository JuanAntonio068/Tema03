package Parte6;

import java.util.*;

public class Problema04 {

	public static void main(String[] args) {

		// Variable para guardar la fila donde está la pieza
		int posFila;

		// Variable para guardar la columna donde está la pieza
		int posColumna;

		// Variable para guardar la pieza que el
		char pieza;

		// Matriz para simular el tablero
		char tablero[][] = new char[8][8];

		//Bucle para asignar valores predertimados al tablero
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = '.';
			}
		}
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos que pieza es
		System.out.println("¿Qué pieza quieres que muestre?");
		pieza = sc.next().charAt(0);

		// Preguntamos la fila donde está la pieza
		System.out.println("Dime la fila donde está la pieza");
		posFila = sc.nextInt();

		// Preguntamos la columna donde está la pieza
		System.out.println("Dime la columna donde está la pieza");
		posColumna = sc.nextInt();

		// Iniciamos la comparación
		if (pieza == 'T')// La pieza es la torre
			movTorre(tablero, posFila, posColumna, pieza);

		if (pieza == 'A')// La pieza es el alfil
			movAlfil(tablero, posFila, posColumna, pieza);

		if (pieza == 'R')// La pieza es la reina
			movReina(tablero, posFila, posColumna, pieza);

		if (pieza == 'C')// La pieza es el caballo
			movCaballo(tablero, posFila, posColumna, pieza);

		// Bucle para imprimir la matriz
		for (char[] filas : tablero) {
			for (char elemento : filas) {
				System.out.print(elemento + "\t");
			}
			System.out.println(" ");
		}
		// Cerramos el escaner
		sc.close();
	}

	private static void movTorre(char[][] tablero, int posFila, int posColumna, char pieza) {

		// Sitio donde está la torre
		tablero[posFila][posColumna] = pieza;

		// Bucle para asignar el movimiento de la torre
		for (int i = 1; i < tablero.length; i++) {

			// Iniciamos la comparación
			if (i != posFila) // Estamos en el moviminto vertical

				tablero[i][posColumna] = 'X';

			if (i != posColumna)// Estamos en el movimiento horizontal

				tablero[posFila][i] = 'X';
		}
	}

	private static void movAlfil(char[][] tablero, int posFila, int posColumna, char pieza) {

		// Sitio donde está el alfil
		tablero[posFila][posColumna] = pieza;

		// Bucle para asignar el movimiento del alfil
		for (int i = 1; i < tablero.length; i++) {

			// Iniciamos la comparación
			if (posFila + i < tablero.length && posColumna + i < tablero.length)// Estamos en la diagonal de arriba a la
																				// derecha
				tablero[posFila + i][posColumna + i] = 'X';

			if (posFila + i < tablero.length && posColumna - i >= 0)// Estamos en la diagonal de abajo a la derecha
				tablero[posFila + i][posColumna - i] = 'X';

			if (posFila - i >= 0 && posColumna + i < tablero.length)// Estamos en la diagonal de arriba a la izquierda
				tablero[posFila - i][posColumna + i] = 'X';

			if (posFila - i >= 0 && posColumna - i >= 0)// Estamos en la diagonal de abajo a la izquierda
				tablero[posFila - i][posColumna - i] = 'X';
		}

	}

	private static void movReina(char[][] tablero, int posFila, int posColumna, char pieza) {



		// Bucle para asignar el movimiento diagonal de la reina
		for (int i = 0; i < tablero.length; i++) {

			// Iniciamos la comparación
			if (posFila + i < tablero.length && posColumna + i < tablero.length)// Estamos en la diagonal de arriba a la
																				// derecha
				tablero[posFila + i][posColumna + i] = 'X';
			if (posFila + i < tablero.length && posColumna - i >= 0)// Estamos en la diagonal de abajo a la derecha
				tablero[posFila + i][posColumna - i] = 'X';
			if (posFila - i >= 0 && posColumna + i < tablero.length)// Estamos en la diagonal de arriba a la izquierda
				tablero[posFila - i][posColumna + i] = 'X';
			if (posFila - i >= 0 && posColumna - i >= 0)// Estamos en la diagonal de abajo a la izquierda
				tablero[posFila - i][posColumna - i] = 'X';

		}

		// Bucle para asignar el movimiento horizontal y vertical de la reina
		for (int i = 0; i < 8; i++) {

			// Iniciamos la comparación
			if (i != posFila) // Estamos en el moviminto vertical

				tablero[i][posColumna] = 'X';

			if (i != posColumna)// Estamos en el movimiento horizontal

				tablero[posFila][i] = 'X';
			
			// Sitio donde está la reina
			tablero[posFila][posColumna] = pieza;
		}
	}

	private static void movCaballo(char[][] tablero, int posFila, int posColumna, char pieza) {

		// Sitio donde está el caballo
		tablero[posFila][posColumna] = pieza;

		// Matriz que contiene todas las posibles combinaciones de movimientos del
		// caballo
		int[][] movimientos = { { 2, 1 }, { 2, -1 }, { -2, 1 }, { -2, -1 }, { 1, 2 }, { 1, -2 }, { -1, 2 },
				{ -1, -2 } };

		// Bucle para asignar el movimiento del caballo
		for (int[] movimiento : movimientos) {

			// Calculamos una nueva fila
			int nuevaFila = posFila + movimiento[0];

			// Calculamos una nueva columna
			int nuevaColumna = posColumna + movimiento[1];
			// Iniciamos la comparación
			if (nuevaFila >= 0 && nuevaFila < tablero.length && nuevaColumna >= 0 && nuevaColumna < tablero.length) {
				// Las nuevas coordenadas están dentro del tablero
				
				tablero[nuevaFila][nuevaColumna] = 'X';
			}
		}
	}
}