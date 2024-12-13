package parte7;

import java.util.*;

public class Problema09 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la frase introducida por el usuario
		String frase;

		final String PREFIJO = "Javalín, javalón";

		final String SUFIJO = "javalén, len, len";

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por una frase
		System.out.println("Dime una frase");
		frase = sc.nextLine();

		// La frase está en el idioma de Javalandia
		if (frase.startsWith(PREFIJO) || frase.endsWith(SUFIJO)) {
			System.out.println("La frase está escrita en el idiona de Javalandia");

			// Quitamos las muletillas
			frase = frase.replace(PREFIJO, "");
			frase = frase.replace(SUFIJO, "");

			// Quitamos los espacios al principio y al final de la cadena
			frase = frase.trim();

		}

		// Imprimimos el resultado
		System.out.println(frase);

		// Cerramos el escaner
		sc.close();
	}

}
