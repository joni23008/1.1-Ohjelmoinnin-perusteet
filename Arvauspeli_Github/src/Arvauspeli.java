import java.util.Scanner;
public class Arvauspeli {

	public static void main(String[] args) {

		
		
		Scanner in = new Scanner(System.in);
		String user;
		String answer = "Emma";
		String stop = "stop";
		int loopCounter = answer.length();
		int count = 0;
		
		System.out.println("Guess my name or type stop to exit");
		
		while (true || count < loopCounter)
		{
		    user = in.nextLine();
		    count++;

		    

		    if (user.equalsIgnoreCase(stop)) 
		    {
		    	break;
		    } 

		    if (user.equalsIgnoreCase(answer)) 
		    {
		        System.out.println("Congratulations!" + "\n" + "You guessed " + count + " times.");
		        break;
		    } 
		    else
		    {
		    	System.out.println("Guess again! (type stop to exit)");
		    	System.out.println("The correct answers starts with ");

		    	for ( int i = 0; i < count; i++) 
		    	{
		    		char clue = answer.charAt(i);
		    		System.out.print(clue);
		    	
		    	}

		    }
		    
		    	
		}
			
			if (user.equalsIgnoreCase(stop))
			{
				count = count -1;
				System.out.println("You guessed " + count + " times.");
			}
		
		
		
			
			
	}

}
