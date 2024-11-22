package parte5;

import java.util.*;

public class Problema01 {

	public static void main(String[] args) {

		// Tabla donde se van a guardar el mínimo y el máximo
		int calculos[] = new int[2];

		// Matriz donde se van a guardar los números aleatorios
		int randoms[][] = new int[6][10];

		// Declaramos la clase random
		Random rand = new Random();

		// Bucle para asignar un valor aleatorio a cada elemento de la matriz
		for (int i = 0; i < randoms.length; i++) {
			for (int j = 0; j < randoms[0].length; j++) {

				randoms[i][j] = rand.nextInt(0, 1001);
			}

		}

		// Llamamos la función
		calculos = minAndMax(randoms);

		// Imprimimos el resultado
		System.out.println("El mínimo y el máximo de la matriz son: " + Arrays.toString(calculos));
	}

	static int[] minAndMax(int[][] randoms) {

		// Variable donde se va a guardar el valor máximo
		int max = Integer.MIN_VALUE;

		// Variable donde se va a guardar el valor mínimo
		int min = Integer.MAX_VALUE;

		// Tabla donde se va a guardar el máximo y el mínimo
		int calculos[] = new int[2];

		// Bucle para calcular el máximo y el mínimo
		for (int i = 0; i < randoms.length; i++) {
			for (int j = 0; j < randoms[0].length; j++) {

				// Iniciamos la comparación
				if (randoms[i][j] > max) {// El elemento actual es mayor que el máximo actual
					max = randoms[i][j];
				}
				if (randoms[i][j] < min) {// El elemto actual es menot que el mínimo actual
					min = randoms[i][j];
				}
			}

		}
		calculos[0] = min;
		calculos[1] = max;

		return calculos;
	}
}
