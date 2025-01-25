package parte8;

import java.util.*;

public class Problema10 {

	public static void main(String[] args) {

		// Declaramos el HashMap
		HashMap<String, Double> productos = new HashMap<>();

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde se va a guardar el producto insertado por el usuario
		String producto;

		// Variable donde se va a guardar el precio del producto insertado por el
		// usuario
		double precio;

		// Variable para guardar la respuesta del usuario
		int opcion;

		// Preguntamos al usuario por una opción
		System.out.println("1. Alta de producto");
		System.out.println("2. Baja de producto");
		System.out.println("3. Listar existencias");
		System.out.println("0. Salir");
		opcion = sc.nextInt();

		// Limpiamos el escaner
		sc.nextLine();

		// Bucle del que no se va a salir hasta que el usuario seleccione 0
		while (opcion != 0) {

			if (opcion == 1) {// El usuario ha elegido la primera opción

				// Preguntamos el nombre al usuario
				System.out.println("Inserta el nombre del producto");
				producto = sc.nextLine().toUpperCase();

				// Preguntamos el precio al usuario
				System.out.println("Inserta el precio del producto");
				precio = sc.nextDouble();

				// Limpiamos el escaner
				sc.nextLine();

				productos.put(producto, precio);

			} else if (opcion == 2) {// El usuario ha elegido la segunda opción

				if (productos.isEmpty()) {// El usuario no ha añadido ningún producto
					System.out.println("No puedes dar de baja ningún producto porque no hay ningún producto añadido");
				} else {

					// Preguntamos al usuario por el producto
					System.out.println("¿Qué producto quieres dar de baja?");
					producto = sc.nextLine().toUpperCase();

					productos.remove(producto);
				}
			} else if (opcion == 3) {// El usuario ha elegido la tercera opción

				if (productos.isEmpty()) {// El usuario no ha añadido ningún producto
					System.out.println("No puedo mostrar las exsitencias, porque no hay ningún producto añadido");
				} else {
					// Imprimimos el mapa
					System.out.println(productos);
				}
			}
			// Preguntamos al usuario por una opción
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Listar existencias");
			System.out.println("0. Salir");
			opcion = sc.nextInt();

			// Limpiamos el escaner
			sc.nextLine();

		}

		// Cerramos el escaner
		sc.close();
	}

}
