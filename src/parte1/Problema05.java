package parte1;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {

		// Variable donde vamos a guardar el número introducido
		double num;

		// Array donde vamos a guardar los números introducidos
		double tabla[] = new double[10];

		// Variable donde se van a ir sumando los elementos
		double suma = 0;

		// Variable donde se va a guardar el máximo
		double maximo = Double.MIN_VALUE;

		// Variable donde se va a guardar el mínimo
		double minimo = Double.MAX_VALUE;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// For donde se va ir añadiendo cada número a un elemento
		for (int i = 0; i < tabla.length; i++) {

			// Preguntamos al usuario por un número
			System.out.println("Dime un número real");
			num = sc.nextDouble();

			tabla[i] = num;

		}

		// For donde se van a sumar los elementos y se van a buscar el mínimo y el
		// máximo
		for (int i = 0; i < tabla.length; i++) {

			suma += tabla[i];

			//Comparación para averiguar el número mayor
			if (maximo < tabla[i]) {
				
				maximo = tabla[i];
			}
			//Comparación para averiguar el número menor
			if (minimo > tabla[i]) {
				
				minimo = tabla[i];
			}
		}
		
		//Imprimimos el resultado
		System.out.println("La suma de todos los números es: " + suma);
		System.out.println("El número máximo es : " + maximo);
		System.out.println("El número mïnimo es : " + minimo);
		
		//Cerramos el escaner
		sc.close();
	}

}
