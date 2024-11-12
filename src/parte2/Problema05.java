package parte2;

import java.util.*;

public class Problema05 {

	public static void main(String[] args) {

		// Variable que va ir contando las veces que se repite el número
		int cont = 0;

		// Variable que guarda el valor dado por el usuario
		int num;

		// Tabla donde se van a guardar los números randoms
		int tabla[] = new int[1000];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la clase random
		Random random = new Random();

		// Bucle para añadir a cada elemento de la tabla un valor
		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = random.nextInt(0, 100);
		}

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");
		num = sc.nextInt();

		// Bucle para buscar el número introducido
		for (int i = 0; i < tabla.length; i++) {

			if (tabla[i] == num) {// El número se ha encotrado
				cont++;
			}
		}
		
		// Imprimos el resultado
		System.out.println((cont >= 1) ? "El valor " + num + " existe en la tabla y se repite " + cont + " veces"
				: "El valor " + num + " no existe en la tabla");

		// Cerramos el escaner
		sc.close();
	}

}
