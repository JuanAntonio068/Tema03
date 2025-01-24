package parte8;

import java.util.*;

public class Problema08 {

	public static void main(String[] args) {

		// Declaramos el HashMap
		HashMap<String, String> registro = new HashMap<>();

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Varible donde se va a pedir el usuario
		String usuario;

		// Varible donde se va a pedir el usuario para el login
		String usuarioLogin;

		// Variable donde se va a pedir la contraseña
		String contraseña = "";

		// Variable que va a guardar la elección del usuario
		int eleccion;

		// Variable para marcar las opurtunidades del usuario
		int opurtunidades;

		// Variable para salir del bucle
		boolean salir = false;

		// Le mostramos al usuario todas sus opciones
		System.out.println("1. Registro");
		System.out.println("2. Login");
		System.out.println("0. Salir");
		eleccion = sc.nextInt();

		while (eleccion > 0) {

			// Reseateamos las opurtinadades y la variable salir
			opurtunidades = 3;
			salir = false;

			if (eleccion == 1) {// El usuario va a hacer un registro

				// Preguntamos al usuario por el usuario
				System.out.println("Inserta el usuario de registro");
				usuario = sc.next();

				// Preguntamos al usuario por la contraseña
				System.out.println("Inserta la contraseña de registro");
				contraseña = sc.next();

				// Lo añadimos al HashMap
				registro.put(usuario, contraseña);
			} else if (eleccion == 2) {// El usuairo va a hacer un login

				while (opurtunidades > 0 && !salir) {
					System.out.println("Inserta el usuario");
					usuarioLogin = sc.next();

					System.out.println("Inserta la contraseña");
					contraseña = sc.next();

					if (registro.get(usuarioLogin) == null) {// El usuario ha introducio el usuario incorrecto
						System.out.println("El usuario es incorrecto");
						opurtunidades--;

					} else if (registro.get(usuarioLogin).equals(contraseña)) {// El usuario ha introducido los campos
																				// correctos
						System.out.println("Ha accedido al área secreta");
						salir = true;
					}

					else {// El usuario ha fallado la contraseña
						System.out.println("La contraseña es incorrecta");
						opurtunidades--;
					}
				}
				if (opurtunidades == 0) {// El usuario se ha quedado sin intentos
					System.out.println("Lo siento, no tiene acceso al área restringida");
				}
			}

			// Le mostramos al usuario todas sus opciones
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("0. Salir");
			eleccion = sc.nextInt();
		}

		// Cerramos el escaner
		sc.close();
	}

}
