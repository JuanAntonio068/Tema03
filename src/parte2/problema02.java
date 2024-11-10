package parte2;

import java.util.*;

public class problema02 {

	public static void main(String[] args) {

		// Tabla donde se van a guardar los primeros 10 números introducidos por el
		// usuario
		int tabla1[] = new int[10];

		// Tabla donde se van a guardar los últimos 10 números introducidos por el
		// usuario
		int tabla2[] = new int[10];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por 20 números
		System.out.println("Dime 20 números");

		// Bucle para asignar los 10 primeros números a la primera tabla
		for (int i = 0; i < tabla1.length; i++) {

			tabla1[i] = sc.nextInt();
		}
		// Bucle para asignar los 10 últimos números a la segunda tabla
		for (int i = 0; i < tabla2.length; i++) {

			tabla2[i] = sc.nextInt();
		}

		// Imprimos el resultado
		System.out.println((Arrays.equals(tabla1, tabla2) ? "Las tablas son iguales" : "Las tablas no son iguales"));

		// Cerramos el escaner
		sc.close();
	}

}
