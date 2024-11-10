package parte1;

import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la temperatura introducida
		double temperatura;

		// Array donde se va a almacenar cada temperatura en un elemento correspondiente
		double media[] = new double[12];

		// Array donde están todos los mseses del año
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// For donde vamos a ir preguntando la temperatura y almacenandola en su
		// elemento correspondiente
		for (int i = 0; i < media.length; i++) {

			// Preguntamos al usuario
			System.out.println("Dime la temperatura media de un mes del año");
			temperatura = sc.nextDouble();

			media[i] = temperatura;

		}

		// Bucle para dibujar el diagrama
		for (int i = 0; i < media.length; i++) {
			System.out.println(meses[i]);

			// Bucle donde se va a dibujar cada barra
			for (int j = 0; j < media[i]; j++) {
				System.out.println("* *");
			}
			System.out.println(media[i] + "°C");
			System.out.println(" ");
		}
		// Cerramos el escaner
		sc.close();
	}

}
