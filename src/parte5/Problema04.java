package parte5;

import java.util.*;

public class Problema04 {

	public static void main(String[] args) {

		// Matriz donde se va a guardar los elementos que escriba el usuario
		int matriz[][] = new int[3][3];

		// Variable para saber si es mágica o no
		boolean esMagica = esMagica(matriz);
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Bucle para asignar valores a caada elemento de la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println((esMagica) ? "La matriz es mágica" : "La matriz no es mágica");

		// Cerramos el escaner
		sc.close();

	}

	static boolean esMagica(int matriz[][]) {

		// Variable para saber si es mágica o no
		boolean esMagica = true;

		while (esMagica) {

			if (matriz[0][0] + matriz[0][1] + matriz[0][2] != matriz[1][0] + matriz[1][1] + matriz[1][2]
					|| matriz[0][0] + matriz[0][1] + matriz[0][2] != matriz[2][0] + matriz[2][1] + matriz[2][2]) {
				esMagica = false;
			}
		}
		return esMagica;
	}
}
