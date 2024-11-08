package parte2;

import java.util.*;
public class problema02 {

	public static void main(String[] args) {
		
		//Variable donde se va a guardar el valor introducido por el usuario
		int num;
		
		//Tabla donde se van a guardar los primeros 10 números introducidos por el usuario
		int tabla1[] = new int[10];
		
		//Tabla donde se van a guardar los últimos 10 números introducidos por el usuario
		int tabla2[] = new int[10];
		
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime 20 números");
		for (int i = 0; i <tabla1.length; i++) {
			
				tabla1[i] = sc.nextInt();
		}	
		
		for (int i = 0; i <tabla1.length; i++) {
			
			System.out.println("Dime un número");
				tabla1[i] = sc.nextInt();
		}	
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
		
		
	}

}
