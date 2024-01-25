package ohjelmointiTENTTI;
import java.util.Scanner;

public class programHamk {
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner (System.in);
		int [] minutes = new int [7];
		minutes[0] = 0;
		minutes[1] = 0;
		minutes[2] = 0;
		minutes[3] = 0;
		minutes[4] = 0;
		minutes[5] = 0;
		minutes[6] = 0;
		int totalMinutes = 0;
		
		
		System.out.println
		("Activity level of exercise (vigorous/moderate)?");
		String activityLevel = in.nextLine();
		
		
		for (int i = 0; i <= 6; i++) 
			{
				System.out.println
				("Minutes on " + (i+1) + ". day?");
				String userMinutes = in.nextLine();
				minutes[i] = Integer.parseInt(userMinutes);
				totalMinutes = totalMinutes + minutes[i];
			}
		
		System.out.println
		("How many times you did muscle strengthening and balance activities?");
		String userAmount = in.nextLine();
		int amount = Integer.parseInt(userAmount);
		
		System.out.println
		("You did " + totalMinutes + " minutes " + activityLevel + " exercise during week.");
		
		checkActivityRecommendation(activityLevel, totalMinutes, amount);
	}
	
	
	public static void checkActivityRecommendation(String activityLevel, int totalMinutes, int amount) 
	{
		if (amount >= 2)
		{
			if(totalMinutes >= 75 && activityLevel.equalsIgnoreCase("vigorous"))
			{
				System.out.println
				("You exercise enough according to the recommendations!");

			}
			else if(totalMinutes >= 150 && activityLevel.equalsIgnoreCase("moderate"))
			{
				System.out.println
				("You exercise enough according to the recommendations!");
				
			}
			else
			{
				System.out.println
				("You should exercise more!");
			}
		}

		else
		{
			System.out.println
			("You should exercise more!");
		}
		
	}

}


