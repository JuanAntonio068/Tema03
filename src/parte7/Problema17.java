package parte7;

import java.util.Scanner;

public class Problema17 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la sentencia original
		String sentenciaC;

		// Variable donde se va a guardar la frase sin comentarios
		String resultado;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuaior por una sentetencia en c
		System.out.println("Ingresa una sentencia en C:");
		sentenciaC = sc.nextLine();

		// Llamamos a la función
		resultado = eliminarComentarios(sentenciaC);

		// Imprimimos el resultado
		System.out.println("El resultado es: " + resultado);

		// Cerramos el escaner
		sc.close();
	}

	public static String eliminarComentarios(String sentenciaC) {

		// Variable donde va a estar la frase sin comentarios
		String sinComentarios = "";

		// Variable para confirmar si se esta dentro de un comentario o no
		boolean enComentario = false;

		for (int i = 0; i < sentenciaC.length(); i++) {

			// El comentario ha empezado
			if (!enComentario && i + 1 < sentenciaC.length() && sentenciaC.charAt(i) == '/'
					&& sentenciaC.charAt(i + 1) == '*') {
				enComentario = true;
				i++;
				// El comentario ha terminado
			} else if (enComentario && i + 1 < sentenciaC.length() && sentenciaC.charAt(i) == '*'
					&& sentenciaC.charAt(i + 1) == '/') {
				enComentario = false;
				i++;
				// Se guardan los caracteres sin los comentarios
			} else if (!enComentario) {
				sinComentarios += sentenciaC.charAt(i);
			}
		}
		return sinComentarios;

	}
}
