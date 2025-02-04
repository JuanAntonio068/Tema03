package parte9;

import java.util.*;

public class Problema04 {

	public static void main(String[] args) {

		// Declaramos la lista
		ArrayList<String> nombres = new ArrayList<>();

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde se le va a preguntar al usuario por un nombre
		String nombre;

		// Variable donde se va a guardar la elección del usuario
		int eleccion;

		// Le mostramos el menú al usuario
		System.out.println("1. Añadir nombre a la lista");
		System.out.println("2. Elimina un nombre específico");
		System.out.println("3. Ordena la lista alafabéticamente");
		System.out.println("4. Busca si un nombre esta en la lista");
		System.out.println("5. Salir");
		eleccion = sc.nextInt();

		// Limpiamos el escaner
		sc.nextLine();

		while (eleccion != 5) {

			if (eleccion == 1) {// El jugador ha elegido añadir un nombre

				// Le preguntamos al usuario por un nombre
				System.out.println("Dime un nombre para añadirlo");
				nombre = sc.nextLine().toLowerCase();

				// Lo añadimos a la lista
				nombres.add(nombre);

			} else if (eleccion == 2) {// El jugador ha elegido borrar un nombre

				if (nombres.isEmpty()) {// Nos aseguramos de que la lista no este vacía

					System.out.println("No se puede borrar nada porque no hay nada en la lista");

				} else {

					// Le preguntamos al usuario por un nombre
					System.out.println("Dime un nombre para borrarlo");
					nombre = sc.nextLine().toLowerCase();

					// Lo borramos de la lista
					nombres.remove(nombre);
				}
			} else if (eleccion == 3) {

				if (nombres.size() < 2) {// Nos aseguramos de que la lista tenga 2 o más nombres

					System.out.println("No se puede ordenar nada porque no hay 2 o más nombres");
				} else {

					// Ordenamos la lista
					Collections.sort(nombres);
				}

			} else if (eleccion == 4) {

				if (nombres.isEmpty()) {// Nos aseguramos de que la lista no este vacía

					System.out.println("No se puede buscar porque no hay nada en la lista");
					
				} else {
					// Le preguntamos al usuario por un nombre
					System.out.println("Dime un nombre para buscarlo");
					nombre = sc.nextLine().toLowerCase();

					if (nombres.contains(nombre)) { // El nombre está en la lista

						System.out.println("El nombre elegido está en la lista");

					} else {// El nombre no está en la lista
						System.out.println("El nombre elegido no está en la lista");
					}
				}
			}

			// Imprimimos la lista
			System.out.println(nombres);

			// Le mostramos el menú al usuario
			System.out.println("1. Añadir nombre a la lista");
			System.out.println("2. Elimina un nombre específico");
			System.out.println("3. Ordena la lista alafabéticamente");
			System.out.println("4. Busca si un nombre esta en la lista");
			System.out.println("5. Salir");
			eleccion = sc.nextInt();

			// Limpiamos el escaner
			sc.nextLine();
		}

		// Cerramos el escaner
		sc.close();
	}

}
