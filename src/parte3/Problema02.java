package parte3;

import java.util.*;

public class Problema02 {

	public static void main(String[] args) {

		// Variable para ir sumando números
		double media = 0;

		// Tabla donde se van a guardas todas las notas mínimas
		double minimos[] = new double[5];

		// Tabla donde se van a guardas todas las notas máximas
		double maximos[] = new double[5];

		// Tabla donde se van a guardas todas las medias
		double medias[] = new double[5];

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

				switch (i) {
				case 0:// Se trata del primer alumno
					if (notas[i][j] < min) {// El número introducido es menor que el anterior
						minimos[i] = notas[i][j];

					} else if (notas[i][j] > max) {// El número introducido es mayor que el anterior
						maximos[i] = notas[i][j];
					}
					break;
				case 1:// Se trata del segundo alumno
					if (notas[i][j] < min) {// El número introducido es menor que el anterior
						minimos[i] = notas[i][j];

					} else if (notas[i][j] > max) {// El número introducido es mayor que el anterior
						maximos[i] = notas[i][j];
					}
					break;
				case 2:// Se trata del tercer alumno
					if (notas[i][j] < min) {// El número introducido es menor que el anterior
						minimos[i] = notas[i][j];

					} else if (notas[i][j] > max) {// El número introducido es mayor que el anterior
						maximos[i] = notas[i][j];
					}
					break;
				case 3:// Se trata del cuarto alumno
					if (notas[i][j] < min) {// El número introducido es menor que el anterior
						minimos[i] = notas[i][j];

					} else if (notas[i][j] > max) {// El número introducido es mayor que el anterior
						maximos[i] = notas[i][j];
					}
					break;
				}
			}
		}

		for (int i = 0; i < notas.length; i++) {// En este bucle se incementando la x
			for (int j = 0; j < notas[0].length; j++) {// En este bucle se va incrementando la y

				media = 0;
				
				media += notas[i][j];

				// Se imprime el elemento que esté en esas coordenadas
				System.out.print(notas[i][j] + "  ");

			}
			// Salto de línea
			System.out.println(" ");
			
			medias [i] = media / notas[i].length - 1;
		}
		System.out.println("Notas mínimas");
		System.out.println(Arrays.toString(minimos));

		System.out.println("Notas máximas");
		System.out.println(Arrays.toString(maximos));

		System.out.println("Medias");
		System.out.println(Arrays.toString(medias));
	}
}
