package parte7;

import java.util.Scanner;

public class Problema18 {

	public static void main(String[] args) {
		// Variable donde se va a guardar el titulo
		String titulo;

		// Variable donde se va a guardar el contenido
		String contenido;

		// Variable donde se va a guardar la estructura html
		String html;

		// Declaraos el escaner
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario por el titulo
		System.out.println("Dime el título de la página web");
		titulo = sc.nextLine();

		// Preguntamos al usuario por el contenido
		System.out.println("Dime el contenido de la página web");
		contenido = sc.nextLine();

		// Llamamos a la función
		html = generarHtml(titulo, contenido);
		
		//Imprimimos el resultado
		System.out.println(html);
		
		//Cerramos el escaner
		sc.close();
	}

	public static String generarHtml(String titulo, String contenido) {
		String html = "<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<title>" + titulo + "</title>\n" + "</head>\n"
				+ "<body>\n" + "<h1>" + titulo + "</h1>\n" + "<p>" + contenido + "</p>\n" + "</body>\n" + "</html>";
		return html;
	}
}
