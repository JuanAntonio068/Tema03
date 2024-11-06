package parte1;

public class Problema04 {

	public static void main(String[] args) {

		// Array para guardar los números dados
		int num[] = new int[12];

		// Asignamos cada número a su elemento correspondiente
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// For-each para imprimir el array
		for (int valor : num) {
			System.out.print(valor + " ");
		}
		// Salto de linea
		System.out.println();

		// Imprimimos la explicación a la pregunta del ejercicio
		System.out.println(
				"Podemos obeservar que en los elementos que no se ha añadido número se pone 0 automáticamente");
	}

}
