import java.util.Scanner;

public class Calculator_V2 
{

	public static void main(String[] args) 
	{
		
	Scanner in = new Scanner(System.in); //Alustetaan skanneri
		String firstAnswer;
		String secondAnswer;
		String thirdAnswer;
		int firstNumber;
		int secondNumber;
		
		
		System.out.println("Write first number,please"); //Kysytään ensimmäinen numero
			firstAnswer = in.nextLine(); //Käyttäjä kirjoittaa ensimmäisen numeron String-muodossa
			firstNumber = Integer.parseInt(firstAnswer); //Muutetaan se Integeriksi
		
		System.out.println("Write second number,please"); //Kysytään toinen numero
			secondAnswer = in.nextLine(); //Käyttäjä kirjoittaa toisen numeron String-muodossa
			secondNumber = Integer.parseInt(secondAnswer); //Muutetaan se Integeriksi
		
		System.out.println("What do you want me to do with them? Write plus or minus"); //Mitä halutaan
			thirdAnswer = in.nextLine(); //Käyttäjä kirjoittaa toiveensa
		
			if (thirdAnswer.equalsIgnoreCase("plus"))
			{
				sumNumbers(firstNumber, secondNumber); //Kutsutaan metodia jolla lasketaan luvut yhteen
			}
		
	}
	public static void sumNumbers(int firstNumber, int secondNumber)
	{
		int sum = firstNumber + secondNumber;
		System.out.println(firstNumber + "+" + secondNumber + "=" + sum);
	}
	
	
}
