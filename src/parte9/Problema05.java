package parte9;

import java.util.*;

public class Problema05 {

	public static void main(String[] args) {

		// Declaramos el mapa
		HashMap<String, Integer> series = new HashMap<>();

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde se va a guardar el nombre de una serie
		String serie;

		// Variable donde se va a guardar la valoración
		int valoracion;

		// Variable para guardar la eleccion del jugador
		int eleccion;

		// Le mostramos el menú al usuario
		System.out.println("1. Agregar serie");
		System.out.println("2. Buscar serie");
		System.out.println("3. Eliminar serie");
		System.out.println("4. Salir");
		eleccion = sc.nextInt();

		// Limpiamos el escaner
		sc.nextLine();

		while (eleccion != 4) {

			if (eleccion == 1) {// El jugador ha elegido añadir una serie

				// Le preguntamos al usuario por una serie
				System.out.println("Dime una serie para añadirla");
				serie = sc.nextLine().toLowerCase();

				// Le preguntamos al usuario por su valoracion
				System.out.println("Dime su valoración");
				valoracion = sc.nextInt();

				// Limpiamos el escaner
				sc.nextLine();

				// Lo añadimos al mapa
				series.put(serie, valoracion);

			} else if (eleccion == 2) { // El jugador ha elegido buscar una serie

				if (series.isEmpty()) {// Nos aseguramos de que la lista no este vacía

					System.out.println("No se puede buscar porque no hay nada en la lista");

				} else {
					// Le preguntamos al usuario por una serie
					System.out.println("Dime una serie para buscarla");
					serie = sc.nextLine().toLowerCase();

					if (series.containsKey(serie)) { // El nombre está en la lista

						System.out.println("La serie está y su valoración es: " + series.get(serie));

					} else {// El nombre no está en la lista
						System.out.println("La serie no está añadidas");
					}
				}

			} else if (eleccion == 3) {

				if (series.isEmpty()) {// Nos aseguramos de que la lista no este vacía

					System.out.println("No se puede borrar nada porque no hay nada en la lista");

				} else {

					// Le preguntamos al usuario por un nombre
					System.out.println("Dime un nombre para borrarlo");
					serie = sc.nextLine().toLowerCase();

					// Lo borramos de la lista
					series.remove(serie);
				}
			}

			// Imprimimos el mapa
			System.out.println(series);

			// Le mostramos el menú al usuario
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
			System.out.println("4. Salir");
			eleccion = sc.nextInt();

			// Limpiamos el escaner
			sc.nextLine();

		}

		// Cerramos el escaner
		sc.close();
	}

}
