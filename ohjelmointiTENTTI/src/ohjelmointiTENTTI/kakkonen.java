package ohjelmointiTENTTI;
import java.util.Scanner;

public class kakkonen {

	public static void main(String[] args) {
//		Create app that user can use to track if he/she is exercising enough. 
//		App will ask level of activity and 
//		then minutes for each day in week (7 days) from user.
//		Use sequence structure/toistorakenne (loop) when asking the minutes. 
//		After getting minutes for each day app will print level of activity and minutes added up.
//
//		Examples
//		Activity level of exercise (vigorous/moderate)?
//		moderate
//		Minutes on 1. day?
//		30
//		Minutes on 2. day?
//		15
//		Minutes on 3. day?
//		30
//		Minutes on 4. day?
//		45
//		Minutes on 5. day?
//		0
//		Minutes on 6. day?
//		0
//		Minutes on 7. day?
//		35
//		You did 155 minutes moderate exercise during week.
		
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
		
		
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		String userLevel = in.nextLine();
		
		
		for (int i = 0; i <= 6; i++) 
			{
				
				System.out.println("Minutes on " + (i+1) + ". day?");
				String userMinutes = in.nextLine();
				minutes[i] = Integer.parseInt(userMinutes);
				totalMinutes = totalMinutes + minutes[i];
			}
		
		System.out.println("You did " + totalMinutes + " minutes " + userLevel + " exercise during week.");
		
	}

}
