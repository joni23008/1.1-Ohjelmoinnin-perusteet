import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		First number?
//				2
//				Second number?
//				3
//				The sum is 5.
		String answer1;
		String answer2;
		
		int number1;
		int number2;
		int sum1;
		
		System.out.println("First number?");
		answer1 = in.nextLine();
		number1 = Integer.parseInt(answer1);
		
		System.out.println("Second number?");
		answer2 = in.nextLine();
		number2 = Integer.parseInt(answer2);
		
		sum1 = number1+number2;
		System.out.println(number1 + " + " + number2 + " = " + sum1);
		
	}

}






		