package parte4;

public class Problema01 {

	public static void main(String[] args) {

		// Variable donde se va a guardar la suma de los elementos
		int suma;

		// Declaramos la tabla
		int tabla[] = { 1, 5, 9, 0 };

		// Llamamos a la función
		suma = suma(tabla);

		// Imprimimos el resultado
		System.out.println(suma);
	}

	// Función de la suma
	static int suma(int[] tabla) {

		// Variable la calcular la suma
		int suma = 0;

		// Bucle para recorrer todo el array
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}

		// Devolvemos suma
		return suma;
	}
}
