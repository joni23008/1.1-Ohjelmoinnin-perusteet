import java.util.ArrayList;
import java.util.Scanner;
public class Advanced_1 {

	public static void main(String[] args) {
//		Create an App. User can type the length of the first three throws.
//		Declare the array. Type is double. Name the array as javelinThrows (throws word is reserved).
//		Ask the values in a loop (for, do-while or while). 
//		Lastly, print the whole array using a loop. Notice the consecutive numbers (colored red).
//		The output in the console should be:
//
//		Throw length
//		80
//		Throw length
//		80.5
//		Throw length
//		78
//		Throw 1: 80.0
//		Throw 2: 80.5
//		Throw 3: 78.0
		


		        // Create a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);

		        // Declare an array to store the javelin throw lengths
		        double[] javelinThrows = new double[3];

		        // Ask the user for the lengths of the first three throws
		        for (int i = 0; i < javelinThrows.length; i++) 
		        {
		            System.out.println("Throw length");
		            javelinThrows[i] = scanner.nextDouble();
		            
		        }

		        // Print the array using a loop
		        for (int i = 0; i < javelinThrows.length; i++) 
		        {
		            System.out.println("Throw " + (i + 1) + ": " + javelinThrows[i]);
		        }

		
		
		
	}

}
