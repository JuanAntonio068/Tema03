package parte1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Problema08 {

	public static void main(String[] args) {

		// Variable donde se va a guardar el número introducido por el usuario
		int num;

		// Tabla donde se va a generar de forma aleatoria los números del 1 al 10
		int tablaRandom[] = new int[100];

		// Variable donde se va a guardar las posiciones del número buscado
		int index = 0;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la clase random
		Random random = new Random();

		// Generamos los elementos de forma aleatoria
		for (int i = 0; i < tablaRandom.length; i++) {

			tablaRandom[i] = random.nextInt(1, 11);
		}

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");
		num = sc.nextInt();

		for (int i = 0; i < tablaRandom.length; i++) {

			if (tablaRandom[i] == num) {
				index = i;
				System.out.println("Se repite el número " + num + " en las posiciones: " + index);
			}
		}
		// Cerramos el escaner
		sc.close();
	}

}
