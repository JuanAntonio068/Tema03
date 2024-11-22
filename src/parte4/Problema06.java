package parte4;

import java.util.*;

public class Problema06 {

	public static void main(String[] args) {

		// Tabla donde se va a gaurdar los números que se van a sumar
		int t[];

		// Variable que guarda el número de elemento consecutivos que se van a sumar
		int numElementos;

		// Variable para indicar la longitud de la tabla
		int longitud;

		// Tabla donde se va a mostrar el resultado
		int suma[];

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por la longtiud de la tabla
		System.out.println("Dime la longitud de la tabla");
		longitud = sc.nextInt();

		t = new int[longitud];

		// Bucle para añadirle valores a la tabla
		for (int i = 0; i < t.length; i++) {

			// Preguntamos al usuario por un número
			System.out.println("Dime un número");
			t[i] = sc.nextInt();
		}

		// Preguntamos al usuario por el número de elementos consecutivos
		System.out.println("Dime el número de elementos consecutivos que quieres sumar");
		numElementos = sc.nextInt();

		// Llamamos a la función
		suma = suma(t, numElementos);

		// Imprimimos el resultado
		System.out.println(Arrays.toString(suma));

		// Cerramos el escaner
		sc.close();
	}

	static int[] suma(int t[], int numElementos) {

		// Llamamos a la función
		int length = length(t, numElementos);

		// Tabla donde se van a ir sumando los elementos
		int suma[] = new int[length];

		// Varaible para ir contando
		int cont = 0;

		// Variable para controlar la posicion de la tabla t
		int index = 0;

		// Bucle para asiganr cada resultado de la suma en un elemento
		for (int i = 0; i < suma.length; i++) {

			// Bucle par ir sumando
			while (cont < numElementos) {

				suma[i] += t[index];

				index++;
				cont++;

			}
			if (numElementos != 2) {
				index -= (numElementos - 1);
			}
			cont = 0;
		}
		return suma;
	}

	static int length(int t[], int numElementos) {

		// Variable donde se va a guardar la longitud de la tabla
		int length;
		length = t.length - numElementos + 1;

		return length;

	}
}
