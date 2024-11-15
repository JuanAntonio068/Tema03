package parte4;

public class Problema01 {

	public static void main(String[] args) {

		int tabla[] = { 1, 5, 9, 0 };
		
		System.out.println();
	}

	static int suma(int[] tabla) {
		
		int suma = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}

		return suma;
	}
}
