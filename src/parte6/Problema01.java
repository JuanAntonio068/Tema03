package parte6;

import java.util.*;

public class Problema01 {

	public static void main(String[] args) {

		// Variable donde se va a guardar el número introducido por el usuario
		int valor;

		// Matriz donde se va a guardar los números introducidos por el usuario
		int matriz[][];

		// Variable donde se va a guardar el número de filas introducido por el usuario
		int filas;

		// Variable donde se va a guardar el número de columas introducido por el
		// usuario
		int columnas;

		// Variable para marcar si valor introducido está en la tabla
		boolean esta;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario el número de filas
		System.out.println("Dime el número de filas de la matriz");
		filas = sc.nextInt();

		// Le preguntamos al usuario el número de columnas
		System.out.println("Dime el número de columnas de la matriz");
		columnas = sc.nextInt();

		matriz = new int[filas][columnas];

		// Bucle para asiganr un valor a cada elemento de la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				matriz[i][j] = sc.nextInt();
			}
		}
		// Preguntamos al usuario por un número para buscarlo
		System.out.println("Dime un valor para buscarlo en la matriz");
		valor = sc.nextInt();

		// Llamamos a la función
		esta = esta(matriz, valor);

		// Imprimimos el resultado
		System.out.println((esta) ? valor + " está en la tabla" : valor + " no está en la tabla");

		// Cerramos el escaner
		sc.close();
	}

	static boolean esta(int[][] matriz, int valor) {

		// Variable para guardar la posicion
		int index = -1;

		// Buscamos en la tabla
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				// Iniciamos la comparación
				if (matriz[i][j] == valor) {// El número está en la matriz
					index = 1;
				}
			}
		}
		// Iniciamos la comaparación
		if (index == 1) {// El número se ha encontrado
			return true;
		} else {// El número no se ha encontrado
			return false;
		}
	}
}
