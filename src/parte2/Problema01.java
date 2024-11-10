package parte2;

import java.util.*;

public class Problema01 {

	public static void main(String[] args) {

		// Variable donde se va a guardar el tamaño que quiere el usuario para la tabla
		int tamaño;

		// Varibale donde se va a guardar el valor que quiere el usuario para la tabla
		int valor;

		// Tabla que va a ser cambiada el tamaño y los valores
		int tabla[];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por el tamaño
		System.out.println("¿Qué tamaño quieres para la tabla?");
		tamaño = sc.nextInt();

		tabla = new int[tamaño];

		// Preguntamos al usuario por el valor
		System.out.println("¿Qué valor quieres para la tabla?");
		valor = sc.nextInt();

		Arrays.fill(tabla, valor);

		// Imprimimos el resulatado
		System.out.println("Tu tabla es: " + Arrays.toString(tabla));

		// Cerramos el escaner
		sc.close();
	}

}
