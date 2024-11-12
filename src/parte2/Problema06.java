package parte2;

import java.util.*;

public class Problema06 {

	public static void main(String[] args) {

		// Variable donde esta la tabla ganadora
		int ganadora[] = { 3, 9, 17, 28, 30, 48 };

		// Variable que genera la aleatoria
		int apuesta[] = new int[6];

		// Variable que va ir contando los aciertos
		int aciertos = 0;

		// Declaramos la clase random
		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			apuesta[i] = random.nextInt(49) + 1;
		}

		//Bucle para vereficar si algún número se repite
		for (int numApuesta : apuesta) {
			for (int numGanadora : ganadora) {
				
				if (numApuesta == numGanadora) {//El número es correcto
				aciertos++;
				}
			}
		}

		//Imprimimos el resultado
		System.out.println("Apuesta: " + Arrays.toString(apuesta));
		System.out.println("Combinación ganadora: " + Arrays.toString(ganadora));
		System.out.println("Número de aciertos: " + aciertos);
	}

}
