
public class advanced_4 
{

	public static void main(String[] args) 
	{
//		Create a method called printTitle. 
//		The method has one parameter (boolean). 
//		If the parameter is true, the stars under the title are printed and otherwise not. 
//
//		If the value is true, the title should be exactly like this:
//
//		The Title
//		*********
		boolean positive = false;

		printTitle(positive);
	}
	public static void printTitle(boolean print)
	{
		if (print)
		{
			System.out.println("The Title");
			System.out.println("*********");
		}
		else
		{
			System.out.println("The Title");
		}

	}

}
