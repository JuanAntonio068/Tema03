package parte1;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {

		// Variable donde vamos a guardar el número dado por el usuario
		double num;

		// Array donde se van a guardar los números
		double lista[] = new double[5];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// For donde vamos a ir preguntando cada valor
		for (int i = 0; i < lista.length; i++) {

			// Preguntamos al usuario por un número decimal
			System.out.println("Dime un número decimal");
			num = sc.nextDouble();

			lista[i] = num;
		}

		// For-each para imprimir el array
		for (double valor : lista) {

			System.out.print(valor + " ");
		}

		// Cerramos el escaner
		sc.close();
	}

}
