package parte3;

import java.util.*;

public class Problema03 {

	public static void main(String[] args) {

		// Variable que guardara el número de filas introducida por el usuario
		int filas;

		// Variable que guardara el número de colummnas introducida por el usuario
		int columnas;

		// Creamos la tabla
		int tabla[][];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario el número de filas
		System.out.println("Dime el número de filas de la tabla");
		filas = sc.nextInt();

		// Preguntamos al usuario el número de columnas
		System.out.println("Dime el número de columnas de la tabla");
		columnas = sc.nextInt();

		tabla = new int[filas][columnas];

		// Bucle para ir añadiendo a cada elemnto de la tabla un valor
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {

				tabla[i][j] = 10 * i + j;
			}

		}
		// Bucle para imprimir la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {

				System.out.print(tabla[i][j] + "\t");
			}
			
			//Salto de linea
			System.out.println(" ");
		}

	}
}