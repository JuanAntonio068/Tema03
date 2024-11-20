package parte4;

import java.util.*;

public class Problema05 {

	public static void main(String[] args) {

		//Tabla donde se va a buscar el valor dado
		int t[] = new int[10];
		
		//Variable para guardar el valor que se tiene que buscar
		int valor;
		
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la clase escaner
		Random rand = new Random();
		
		//Bucle para asiganr valores a cada elemento
		for (int i = 0; i < t.length; i++) {
			
			t[i] = rand.nextInt(1,6);
		}
		
		//Preguntamos al usario el valor que busca
		System.out.println("Dime un valor entre 1 y 5");
		valor = sc.nextInt();
		
		//Llamamos la función
		System.out.println(Arrays.toString(buscarTodos(t, valor)));
		
		//Cerramos el escaner
		sc.close();
	}

	static int[] buscarTodos (int t[], int valor) {
		
		//Tabla donde se va a guardar los índices del número encontrado
		int index[] = new int[numVeces(t, valor)];
		
		//Bucle para buscar en la tabla 
		for (int i = 0; i < index.length; i++) {
		
			index[i] = 1;
		}
		return index;
		
	}
	
	static int numVeces (int t[], int valor) {
		
		//Variable para ir contando las veces que un número se repite
		int contador = 0;
		
		for (int i : t) {
			
			if (i == valor) {
				contador++;
			}
		}
		return contador;
	}
}
