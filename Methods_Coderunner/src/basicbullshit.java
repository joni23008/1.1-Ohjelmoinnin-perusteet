
public class basicbullshit {

	public static void main(String[] args) {
//		Create method called printGreater.
//		The method has two parameters and prints the greater number. 
//
//		If the numbers 2 and 3 are passed to the method, the method prints:
//
//		3
//		If both are equal, print:
//
//		The numbers are equal.
		
		printGreater(2,2);;
	}
	public static void printGreater(int a,int b)
	{
		if (a == b)
		{
			System.out.println("The numbers are equal");
		}
		else if (a > b)
		{
			System.out.println(a);
		}
		else if (b > a)
		{
			System.out.println(b);
		}
	}
	
	
	
}
