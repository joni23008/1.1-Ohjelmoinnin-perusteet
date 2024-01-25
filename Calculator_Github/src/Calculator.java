import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {


Scanner in = new Scanner(System.in);

String answer1;
String answer2;
String answer3;

int number1;
int number2;
int number3;

int sum1;
int sum2;
int sum3;

	System.out.println("Kirjoita 1.numero");
	answer1 = in.nextLine();
	number1 = Integer.parseInt(answer1);
	//Syötä ensimmäinen numero,parseint muuttaa sen tietokoneen kieleksi numeroksi
	
	System.out.println("Kirjoita 2.numero");
	answer2 = in.nextLine();
	number2 = Integer.parseInt(answer2);
	//Syötä toinen numero
	
	System.out.println("Haluatko laskea luvut yhteen,vähentää tai jakaa? Kirjoita plus,miinus tai jako");
	//Syötä plus tai miinus
	answer3 = in.nextLine();
	
	if (answer3.equals("plus"))
	
		{
			sum1 = number1 + number2;
			if (sum1 > 10)
			{
				System.out.println("Tulos on yli 10. Tulos on " + sum1);
			}
			else
			{
			sum1 = number1 + number2;
			System.out.println ("Tulos on " + sum1);
			}
		}
	
	if (answer3.equals("miinus"))
		{
			sum2 = number1 - number2;
			if (sum2 < 10)
			{
				System.out.println ("Tulos on alle 10. Tulos on " + sum2);
			}
			
			else
			{
				System.out.println ("Tulos on " + sum2);
			}
		}
	
	if (answer3.equals("jako"))
	{
		sum3 = number1 / number2;
		if (sum3 < 10)
		{
			System.out.println ("Tulos on alle 10. Tulos on " + sum3);
		}
		
		else
		{
			System.out.println ("Tulos on " + sum3);
		}
	}
	

	
	
	}

}
