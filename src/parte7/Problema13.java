package parte7;

import java.util.*;

public class Problema13 {

	public static void main(String[] args) {

		// Variable donde se va a guardar una palabra
		String palabra1;

		// Variable donde se va a guardar otra palabra
		String palabra2;

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable donde se va a saber si es un anagrama
		boolean anagrama;

		// Pregutnamos al usuario por una palabra
		System.out.println("Dime una palabra");
		palabra1 = sc.next();

		// Preguntamos al usuario por otra palabra
		System.out.println("Dime otra palabra");
		palabra2 = sc.next();

	}

	public static boolean sonAnagrama(String palabra1, String palabra2) {
		
		//Variable donde se va a saber si es un anagrama
		boolean anagrama;
				
		if (palabra1.length() != palabra2.length()) {
			anagrama = false;
		} else {
			
			
		}
	}
}
