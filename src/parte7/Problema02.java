package parte7;

import java.util.*;

public class Problema02 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde va a estar guardada la contraseña
		String contraseña;

		// Array donde se va a mostrar la frase con los asteriscos
		char[] jugada;

		//Variable donde se a a pasar la tabla en formato cadena
		String jugadaStr;
		
		// Variable donde el jugador dos va a introducir la frase
		String turno;

		// Preguntamos al jugador 1 que escriba una contraseña
		System.out.println("Jugador 1: Escribe una contraseña");
		contraseña = sc.nextLine();

		//Ajustamos la longitud de la tabla
		jugada = new char[contraseña.length()];
		
		//Bucle para rellenar la tabla de asteristicos
		for (int i = 0; i < jugada.length; i++) {
			jugada[i] = '*';
		}
		// Preguntamos al jugador 2 por una contraseña
		System.out.println("Intenta adivinar la contraseña de " + contraseña.length() + " caracteres");
		turno = sc.nextLine();

		// Bucle donde se va a ir intentando adivinar la contraseña
		while (!(contraseña.equals(turno))) {

			// Bucle donde se compara las dos frases
			for (int i = 0; i < contraseña.length(); i++) {

				// Iniciamos la comparación
				if (contraseña.charAt(i) == turno.charAt(i)) {
					jugada[i] = turno.charAt(i);
				}
				
			}
			
			//Pasamos la tabla a cadena y la imprimimos
			jugadaStr = String.valueOf(jugada);
			
			//Imprimimos la cadena
			System.out.println(jugadaStr);

			//Preguntamos otra vez al usuario por la contraseña
			System.out.println("Intenta adivinar la contraseña");
			turno = sc.nextLine();
		}
		
		System.out.println("Felecidades, has ganado el juego, la contraseña era: " + contraseña);
	}

}
