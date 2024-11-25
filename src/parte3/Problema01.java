package parte3;

public class Problema01 {

	public static void main(String[] args) {

		// Tabla bidimensional donde se va a guardar la tabla
		int matriz[][] = new int[3][6];

		// Asignamos a cada elemento un número
		matriz[0][0] = 0;
		matriz[0][1] = 30;
		matriz[0][2] = 2;
		matriz[0][5] = 5;
		matriz[1][0] = 75;
		matriz[1][4] = 0;
		matriz[2][2] = -2;
		matriz[2][3] = 0;
		matriz[2][5] = 0;

		// Bucle donde se va a imprimir la matriz
		for (int i = 0; i < matriz.length; i++) {// En este bucle se incementando la x
			for (int j = 0; j < matriz[0].length; j++) {// En este bucle se va incrementando la y

				// Se imprime el elemento que esté en esas coordenadas
				System.out.print(matriz[i][j] + " ");
			}
			// Salto de línea
			System.out.println(" ");
		}
	}

}
