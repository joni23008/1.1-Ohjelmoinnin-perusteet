
public class advanced_5 {

	public static void main(String[] args) 
	{
//	Create a method called calculate. 
//	The method has three parameters. 
//	The first two parameters are numbers and the third is a String. 
//	The value of the third parameter can be sum, subtraction or multiplication. 
//	So if the values are 2, 3 and multiplication. The method should print: 
//
//	The result is 6.
//	Notice the full stop in the end.
		int num1 = 2;
		int num2 = 3;
		String what = "sum";
		
		calculate(num1,num2,what);
	}
	public static void calculate(int num1, int num2, String what)
	{

		
		if(what.equalsIgnoreCase("sum"))
		{
			int answer = num1 + num2;
			System.out.println("The result is " + answer + ".");
		
		}
		else if(what.equalsIgnoreCase("subtraction"))
		{
			int answer = num1 - num2;
			System.out.println("The result is " + answer + ".");
			
		}
		else if(what.equalsIgnoreCase("multiplication"))
		{
			int answer = num1 * num2;
			System.out.println("The result is " + answer + ".");
			
			
		}
		

	}
	
	
}
