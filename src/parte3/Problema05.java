package parte3;

import java.util.*;

public class Problema05 {

	public static void main(String[] args) {
 
		//Creamos la tabla
		int numerosAleatorios[][] = new int[4][5];
		
		//Variable para ir sumando
		int suma = 0;

		//Variable para hacer la suma total
		int sumaTotal = 0;
		
		//Declaramos la clase random
		Random random = new Random();

		//Bucle para asginar a vada elemento un valor aleaotorio
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[0].length; j++) {
				
				numerosAleatorios[i][j] = random.nextInt(100, 1000);
			}
		}
		
		//Bucle para imprimir la tabla e ir sumando el total de cada fila
		for (int i = 0; i < numerosAleatorios.length; i++) {
			suma = 0;
			for (int j = 0; j < numerosAleatorios[0].length; j++) {
				System.out.print(numerosAleatorios[i][j] + "\t");
				suma += numerosAleatorios[i][j];
			}
			
			System.out.println(suma);
			//Salto de linea
			System.out.println(" ");
		}
		
		//Bucle para calcular la suma total de las columnas y la suma total de todas las columnas juntas
		for (int j = 0; j < numerosAleatorios[0].length; j++) {
			suma = 0;
			for (int i = 0; i < numerosAleatorios.length; i++) {
				suma += numerosAleatorios[i][j];
				sumaTotal += suma;
			}
			System.out.print(suma + "\t");
		}
		System.out.print(sumaTotal);
	}

}
