package parte4;

import java.util.*;

public class Problema04 {

	public static void main(String[] args) {

		// Tabla donde se va a buscar el valor
		int t[] = { 2, 5, 20, 29, 30, 38, 40, 45, 50 };

		// Variable para escribir el valor a buscar
		int clave;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario el valor que está buscando
		System.out.println("Dime el valor que buscas");
		clave = sc.nextInt();

		// Llamamos a la función
		System.out.println(buscar(t, clave));

		// Cerramos el escaner
		sc.close();
	}

	static int buscar(int t[], int clave) {

		// Variable donde se va a guuardar la posición del elemento buscado
		int index;

		// Buscamos el valor en la tabla
		index = Arrays.binarySearch(t, clave);

		// El número pedido no ha sido encontrado
		if (index < 0)
			index = -1;

		// Devolvemos la posición
		return index;

	}

}
