package ohjelmointiTENTTI;

public class tentti {

//	Create method called checkActivityRecommendation that takes two parameters 
//	(activityLevel type String and amount type integer).
//	If amount of exercise is 75 or more when activityLevel is "vigorous" 
//	or if amount of exercise is 150 or more when activityLevel is "moderate" 
//	method will print “You exercise enough according to the recommendations!”
//	else “You should exercise more!”
	
//	
//	If the method gets arguments “moderate” and 155 the method prints:
//
//		You exercise enough according to the recommendations!
//		If the method gets arguments “vigorous” and 65 the method prints:
//
//		You should exercise more!
	public static void main(String[] args) 
	{
		
		checkActivityRecommendation("vigorous", 80);
	}

	public static void checkActivityRecommendation(String activityLevel, int amount) 
	{
		if(amount >= 75 && activityLevel.equalsIgnoreCase("vigorous"))
		{
			System.out.println("You exercise enough according to the recommendations!");

		}
		else if(amount >= 150 && activityLevel.equalsIgnoreCase("moderate"))
		{
			System.out.println("You exercise enough according to the recommendations!");

		}
		else
		{
			System.out.println("You should exercise more!");
		}
		
	}

}
