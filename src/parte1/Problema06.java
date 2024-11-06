package parte1;

import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {

		//Variable donde se va a guardar el número introducido
		int num;
		
		//Array donde se va a guardar todos los números introducidos por el usuario
		int tabla[] = new int[8];
		
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		
		//For donde se va a ir añadiendo cada número a su respectivo elemento
		for (int i = 0; i < tabla.length; i++) {
			
			System.out.println("Dime un número");
			num = sc.nextInt();
			
			tabla[i] = num;
		}
		//For donde vamos a verificar qué elemento es par y cuál no
		for (int i = 0; i < tabla.length; i++) {
			
			//Iniciamos la comparación
			if (tabla[i] % 2 == 0) {//El número es par
				
				System.out.println(tabla[i] + " par");
				
			}else {//El número es impar
				
				System.out.println(tabla[i] + " impar");
			}
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
