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
		String tablero[][] = new String[8][8];

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

		tablero = movReina(posFila, posColumna, pieza);

		// Bucle para imprimir la matriz
		for (String[] filas : tablero) {
			for (String elemento : filas) {
				System.out.print(elemento + "\t");
			}
			System.out.println(" ");
			System.out.println(" ");
		}
		// Cerramos el escaner
		sc.close();
	}

	static String[][] movTorre(int posFila, int posColumna, char pieza) {

		// Matriz donde va a estar el tablero con la torre
		String torre[][] = new String[8][8];

		// Bucle para asignar el movimiento de la torre
		for (int i = 0; i < torre.length; i++) {
			torre[i][posColumna] = "X";
		}
		// Bucle para asignar el movimiento de la torre
		for (int j = 0; j < torre[0].length; j++) {
			torre[posFila][j] = "X";
		}

		// Sitio donde está la torre
		torre[posFila][posColumna] = "T";

		return torre;
	}

	static String[][] movAlfil(int posFila, int posColumna, char pieza) {

		// Matriz donde va a estar el tablero con el alfil
		String alfil[][] = new String[8][8];

		// Variable para ir contando las filas
		int i = posFila;

		// Variable para ir contando las columnas
		int j = posColumna;

		// Bucles para rellenar la matriz con el movimiento del alfil
		while (i >= 0) {
			alfil[i--][j--] = "X";
		}

		i = posFila;
		j = posColumna;

		while (i >= 0 && j < alfil.length) {
			alfil[i--][j++] = "X";
		}
		i = posFila;
		j = posColumna;
		while (i < alfil.length) {
			alfil[i++][j--] = "X";
		}
		i = posFila;
		j = posColumna;

		while (i < alfil.length) {
			alfil[i++][j++] = "X";
		}
		i = posFila;
		j = posColumna;

		// Sitio donde está el alfil
		alfil[posFila][posColumna] = "A";

		return alfil;
	}

	static String[][] movReina(int posFila, int posColumna, char pieza) {

		// Matriz donde va a estar el tablero con la reina
		String reina[][] = new String[8][8];

		// Variable para ir contando las filas
		int i = posFila;

		// Variable para ir contando las columnas
		int j = posColumna;

		// Bucles para rellenar la matriz con el movimineto de la reina
		while (i >= 0) {
			reina[i--][j--] = "X";
		}

		i = posFila;
		j = posColumna;

		while (i >= 0 && j < reina.length) {
			reina[i--][j++] = "X";
		}
		i = posFila;
		j = posColumna;
		while (i < reina.length) {
			reina[i++][j--] = "X";
		}
		i = posFila;
		j = posColumna;

		while (i < reina.length) {
			reina[i++][j++] = "X";
		}
		i = posFila;
		j = posColumna;

		// Bucle para asignar el movimiento de la reina
		for (int i1 = 0; i1 < reina.length; i1++) {
			reina[i1][posColumna] = "X";
		}
		// Bucle para asignar el movimiento de la reina
		for (int j1 = 0; j1 < reina[0].length; j1++) {
			reina[posFila][j1] = "X";
		}

		// Sitio donde está la reina
		reina[posFila][posColumna] = "R";

		return reina;
	}

	static String[][] movCaballo(int posFila, int posColumna, char pieza) {
		
		// Matriz donde va a estar el tablero con el caballo
		String caballo[][] = new String[8][8];

	}
}