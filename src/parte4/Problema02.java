package parte4;

public class Problema02 {

	public static void main(String[] args) {

		// Variable donde se va a guardar el máximo
		int max;

		// Iniciamos la tabla
		int t[] = { 0, 6, 78, 30, 58, 2 };

		// Llamamos a la función
		max = max(t);

		// Imprimimos el resultado
		System.out.println(max);
	}

	// Iniciamos la función max
	static int max(int[] t) {

		// Variable para calcular el máximo
		int max = Integer.MIN_VALUE;

		// Bucle para recorrer el array
		for (int i = 0; i < t.length; i++) {

			if (max < t[i]) {// El numero es mayor que el máximo actual

				max = t[i];
			}
		}

		// Devolvemos max
		return max;

	}
}
