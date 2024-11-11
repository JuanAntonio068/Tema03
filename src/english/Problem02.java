package english;

import java.util.*;

public class Problem02 {

	public static void main(String[] args) {

		// Variable that save the length of the table
		int length;

		// Variable that save the increases
		int i;

		// Variable that save the value
		int value;

		// Table that will be changed
		int table[];

		// We create the scanner
		Scanner sc = new Scanner(System.in);

		// We ask to the user the length of the table
		System.out.println("Tell me the length of the table");
		length = sc.nextInt();

		table = new int[length];

		// We ask the user the value
		System.out.println("Tell me a value");
		value = sc.nextInt();

		table[0] = value;

		// We ask the user the increases
		System.out.println("Tell me the increases");
		i = sc.nextInt();

		for (int j = 1; j < table.length; j++) {

			value += i;
			table[j] += value;

		}
		// We print the result
		System.out.println(Arrays.toString(table));

		// We close the scanner
		sc.close();
	}
}
