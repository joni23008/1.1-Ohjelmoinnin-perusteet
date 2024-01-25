
public class advanced_2 {

	public static void main(String[] args) 
	{

		//		Create a method called aphorismPrinter. 
//		In the method create an array and assign the following aphorisms to it:
//
//		Actions speak louder than words.
//		A barking dog never bites.
//		A penny saved is a penny earned.
//		All things come to those who wait.
//		Please, copy the these aphorisms to the code.
//		They must be precisely written to pass the tests cases.
//
//		The method has one parameter. 
//		The value can be 0-3. If the method gets 2,
//		the 3rd aphorism is printed to the console (A Penny...).
//		If the method gets 3, the last aphorism is printed. 
//		So the parameter is the same as the index of the array.
		aphorismPrinter(3);
	}

	public static void aphorismPrinter(int user) 
	{
		
		String[] aphorism = new String[4];
		aphorism[0] = "Actions speak louder than words.";
		aphorism[1] = "A barking dog never bites.";
		aphorism[2] = "A penny saved is a penny earned.";
		aphorism[3] = "All things come to those who wait.";
		
		System.out.println(aphorism[user]);
		
		
	}

	
}
