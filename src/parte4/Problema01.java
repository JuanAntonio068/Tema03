package parte4;

public class Problema01 {

	public static void main(String[] args) {

		//Declaramos la tabla
		int tabla[] = { 1, 5, 9, 0 };

		//Llamamos a la función
		System.out.println(suma(tabla));
	}

	//Función de la suma
	static int suma(int[] tabla) {

		//Variable la calcular la suma
		int suma = 0;
		
		//Bucle para recorrer todo el array
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}

		//Devolvemos suma
		return suma;
	}
}
