import java.util.Arrays;
public class Arrays_Lists_2 {

	public static void main(String[] args) {
//		Create an array that has the following values:
//
//			Green
//			Blue
//			Yellow
//
//			1. Print the value of the second index.
//
//			2. Print the whole array using a loop. Before the value, print the number of the array slot, like this:
//
//			1. Green
//			2. Blue
//			3. Yellow

		
		String[] colors = { "Green" , "Blue" , "Yellow" };
		int number = 0;
		
		System.out.println(colors[1]);
		
		
		for (int i = 0; i < colors.length; i++) 
			{
				number++;
				System.out.print(number + ". ");
				System.out.println(colors[i]);
			 
			}
	}

}
