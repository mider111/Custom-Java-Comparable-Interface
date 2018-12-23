import java.util.*;
import java.io.*;

public class TestFood {

	public static void main(String[] args) {

		// The code is placed within a try block in case a FileNotFoundException is
		// generated.
		try {

			// Declaration of variables
			Scanner sc = new Scanner(new File("food-input.txt"));
			Food[] foodArray = new Food[5];
			String manufacturer;
			String foodName;
			double price;

			// Creating 5 Food instances to place in our foodArray.
			for (int i = 0; i < 5; i++) {
				manufacturer = sc.next();
				foodName = sc.next();
				price = sc.nextDouble();
				foodArray[i] = new Food(manufacturer, foodName, price);
			}

			sc.close();

			// Sort the array and print the result to an output file.
			File output = new File("food-output.txt");
			PrintWriter pw = new PrintWriter(output);

			// Printing the unsorted array.
			for (int i = 0; i < 5; i++) {
				pw.println(foodArray[i]);
			}

			pw.println("SORTED: ");

			// Arrays.sort() works because of the implemented Comparable interface.
			Arrays.sort(foodArray);

			// Printing the sorted array.
			for (int i = 0; i < 5; i++) {
				pw.println(foodArray[i]);
			}

			pw.close();

		}

		// The code may generate a FileNotFoundException.
		catch (FileNotFoundException error404) {

			System.out.println("File not found" + error404);

		}

	}
}
