import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Lists_1 {

	public static void main(String[] args) {

//		Create an array and assign the following aphorisms to it:
//
//			Actions speak louder than words.
//			A barking dog never bites.
//			A penny saved is a penny earned.
//			All things come to those who wait.
//			Please, copy the these aphorisms to the code. They must be precisely written to pass the tests.
//
//			Ask the user to type number from 1 to 4. If the user types 2, print the second aphorism (A barking...).
//
//			The output in the console should be the following:
//
//			Pick number from 1-4.
//			3
//			A penny saved is a penny earned.
			String[] aphorims;
			aphorims = new String [5];
			aphorims[0] = "";
			aphorims[1] = "Actions speak louder than words.";
			aphorims[2] = "A barking dog never bites.";
			aphorims[3] = "A penny saved is a penny earned.";
			aphorims[4] = "All things come to those who wait.";
			
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Pick number from 1-4.");

			String user = in.nextLine();
			int userInt = Integer.parseInt(user);
			int[] numbers = { 1 , 2 , 3 , 4 };
			
			
			for (int i = 0; i < aphorims.length; i++) 
			{
			  if (userInt == i)
			  {
				  System.out.print(aphorims[userInt]);
				  
				  
			  }
				

			}
		
			
			
			
	}

}
