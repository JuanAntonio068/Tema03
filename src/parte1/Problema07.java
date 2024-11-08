package parte1;

import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {

		//Variable donde se va a guardar la temperatura introducida
		double temperatura;
		
		//Array donde se va a almacenar cada temperatura en un elemento correspondiente
		double media[] = new double[12];
		
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		
		//For donde vamos a ir preguntando la temperatura y almacenandola en su elemento correspondiente
		for (int i = 0; i < media.length;i++) {
			
			//Preguntamos al usuario
			System.out.println("Dime la temperatura media de un mes del año");
			temperatura = sc.nextDouble();
			
			media[i] = temperatura;
			
		}
	
		sc.close();
	}

}
