package parte2;

import java.util.*;

public class Problema07 {

	public static void main(String[] args) {

		// Variable para ajustar el tamaño
		int tamaño = 0;

		// Variable para llevar un seguimiento de la posición actual
		int index = 0;

		//Tabla donde se van a generar los números
		int tabla[];

		//Ajustamos el tamaño de la tabla
		for (int i = 0; i <= 10; i++) {
			tamaño += i;
		}

		tabla = new int[tamaño];
		
		//Bucle donde se va a ir rellenando los elementos de la tabla
		for (int i = 0; i <= 10; i++) {
			
			//Rellenamos el elemento con la posición correspondida
			Arrays.fill(tabla, index, index + i, i);
			
			index += i;
		}
		
		//Imprimimos el resultado
		System.out.println(Arrays.toString(tabla));
	}

}
