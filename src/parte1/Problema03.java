package parte1;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {

		// Variable donde se van a guardar el número introducido
		int num;

		// Array para guardar los números
		int tabla[] = new int[10];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// For para preguntar cada número
		for (int i = 0; i < tabla.length; i++) {

			// Preguntamos al usuario por un número
			System.out.println("Dime un número");
			num = sc.nextInt();

			tabla[i] = num;

		}

		// For para invertir el array
		for (int i = tabla.length; i > 0; i--) {

			// Imprimimos el resultado
			System.out.print(i + " ");

		}

		// Cerramos el escaner
		sc.close();
	}

}
