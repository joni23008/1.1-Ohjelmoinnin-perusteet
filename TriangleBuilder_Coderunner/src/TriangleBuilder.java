import java.util.Scanner;
public class TriangleBuilder {

	public static void main(String[] args) {
	
//		Ask the user to type how big the triangle should be (how many rows).
//		Then print the following triangle patterns using for loops (here the user answered 5).
//		Output should be like:
//
//		How many rows?
//		5
//		*
//		** 
//		*** 
//		**** 
//		***** 
//
//		Hints 
//		You will need two for loops. The first for loop counts the rows and the second prints the stars. 
//		In for loops it may be a good idea to use variables like rows and stars instead of typical i. 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many rows?");
		String userString = in.nextLine();
		int userInt = Integer.parseInt(userString);
		
		
		String stars = String.valueOf(userInt);
	
		
		
//		System.out.println(userInt-4);
//		System.out.println(userInt-3);
//		System.out.println(userInt-2);
//		System.out.println(userInt-1);
//		System.out.println(userInt);
		
		System.out.println(stars);
		
	}

}
