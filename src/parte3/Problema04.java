package parte3;

public class Problema04 {

	public static void main(String[] args) {

		//Creamos la tabla
		int tabla[][] = new int[10][10];
		
		//Bucle para asignar los valores a la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				
				
				tabla[i][j] = (i + 1)* (j + 1);
			}
		}
		
		//Bucle para imprimir la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				
				
				System.out.print(tabla[i][j] + "\t");
			}
			//Satlo de linea
			System.out.println(" ");
		}

	}

}
