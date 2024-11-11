package english;

import java.util.*;

public class Problem01 {

	public static void main(String[] args) {

		// Variable that save the option introduced by the user
		String option = null;

		// Variable that save the position introduced by the user
		int position;

		// Variable that save the value introduced by the user
		int value;

		// Table that we will be changing
		int table[] = new int[10];

		// We start the scanner
		Scanner sc = new Scanner(System.in);

		// Loop where the menu is working
		do {

			// We asked to the user
			System.out.println("a. Show values.");
			System.out.println("b. Introduce a value.");
			System.out.println("c. Exit.");
			option = sc.next().toLowerCase();

			
			switch (option) {
			
			case "a": 
				
				//We print the table
				System.out.println(Arrays.toString(table));
				break;
			case "b": 
				
				//We aske to the user the value
				System.out.println("Tell me the value");
				value = sc.nextInt();

				//We aske to the user the position
				System.out.println("Tell me the position");
				position = sc.nextInt();
				
				table[position] = value;
				break;
			}
			// The loop is working until the user write c
		}while (!(option.equals("c")));
		
		//We close the scanner
		sc.close();
	}
}
