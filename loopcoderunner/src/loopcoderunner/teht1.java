package loopcoderunner;
import java.util.Scanner;
public class teht1 {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);
		
		String firstWord;
		String lastWord;
		int firstNumber;
		int lastNumber;
		
		System.out.println("First number?");
		firstWord = in.nextLine();
		firstNumber = Integer.parseInt(firstWord);
		
		System.out.println("Last number?");
		lastWord = in.nextLine();
		lastNumber = Integer.parseInt(lastWord);
		
		

		for (int number = firstNumber; number <= lastNumber; number++)
	{		
	
			  if (firstNumber == lastNumber)
	{			  
				  
				  
			    break;
	}
			  System.out.println(number);
		
	}
		
		
		
		
		
		
		
	}

}
