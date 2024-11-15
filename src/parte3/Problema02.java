package parte3;

import java.util.*;

public class Problema02 {

	public static void main(String[] args) {

		// Variable para ir sumando números
		double suma = 0;
		// Variable para calcular la media
		double media = 0;

		// Matriz para mostrar la nota de los alumnos
		double notas[][] = new double[4][5];

		// Varaible para guardar la nota mínima
		double min = Double.MAX_VALUE;

		// Variable para guardar la nota máxima
		double max = Double.MIN_VALUE;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Bucle para asiganar las notas
		for (int i = 0; i < notas.length; i++) {// En este bucle se incementando la x
			for (int j = 0; j < notas[0].length; j++) {// En este bucle se va incrementando la y

				// Preguntamos al usuario por una nota
				System.out.println("Dime una nota");
				notas[i][j] = sc.nextDouble();

			}
		}

		for (int i = 0; i < notas.length; i++) {// En este bucle se incementando la x
			for (int j = 0; j < notas[0].length; j++) {// En este bucle se va incrementando la y

				// Se imprime el elemento que esté en esas coordenadas
				System.out.print(notas[i][j] + "  ");

			}

			// Salto de línea
			System.out.println(" ");

		}
		for (int i = 0; i < notas.length; i++) {// En este bucle se incementando la x
			suma = 0;
			min = notas[i][0];
			max = notas[i][0];
			for (int j = 0; j < notas[0].length; j++) {// En este bucle se va incrementando la y

				suma += notas[i][j];

				// Hcemos la comparauación
				if (notas[i][j] < min) {

					min = notas[i][j];
				}
				if (notas[i][j] > max) {

					max = notas[i][j];
				}
			}
			media = suma / notas[i].length;

			// Imprimimos los resultados
			System.out.println("Notas mínimas: " + min);

			System.out.println("Notas máximas: " + max);

			System.out.println("Medias: " + media);

		}
		// Cerramos el escaner
		sc.close();
	}
}
