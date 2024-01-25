package harjoituuuuuus;

import java.util.Scanner;  // Import the Scanner class

public class vitututututuutu

	public static void main(String[] args, String ) {
//		1. Pyydä käyttäjää kirjoittamaan numero
//
//		2. Kysy toista numeroa
//
//		3. Summaa numerot ja tulosta tulos konsoliin.
//
//		4. Jatka ohjelmaa siten, että jos tulos on yli 10, tulosta tähän tyyliin: “Tulos on yli 10. Tulos on...”. Muuten tulosta yllä olevalla tavalla.
//
//		5. Jatka vielä siten, että kysyt käyttäjältä numeroiden kysymisen jälkeen, haluaako hän laskea luvut yhteen vai vähentää. Jos esimerkiksi käyttäjä haluaa vähentää, hän vastaa “miinus”.
//
//		6. Tee uusi ohjelma tai jatka edellistä. Pyydä edelleen kaksi lukua ja jaa luvut. Tulosta jakolaskun tulos.


Scanner in = new Scanner(System.in);

String answer1;
String answer2;
String answer3;

int number1;
int number2;

int sum1;
int sum2;

	System.out.println("Kirjoita 1.numero");
	answer1 = in.nextLine();
	number1 = Integer.parseInt(answer1);
	//Syötä ensimmäinen numero,parseint muuttaa sen tietokoneen kieleksi numeroksi
	
	System.out.println("Kirjoita 2.numero");
	answer2 = in.nextLine();
	number2 = Integer.parseInt(answer2);
	//Syötä toinen numero
	
	System.out.println("Haluatko laskea luvut yhteen vai vähentää? Kirjoita plus tai miinus");
	//Syötä plus tai miinus
	answer3 = in.nextLine();

	
	
	
//	sum1 = number1 + number2;
//			if (sum1 > 10)
//			{
//				System.out.println ("Tulos on yli 10. Tulos on " + sum1);
//			}
//	
//			else
//			{
//				System.out.println ("Tulos on " + sum1);
//			}
			
	
//	sum2 = number1 - number2;
//			if (sum2 < 10)
//			{
//				System.out.println ("Tulos on alle 10. Tulos on " + sum2);
//			}
//			
//			else
//			{
//				System.out.println ("Tulos on " + sum2);
//			}
//	
	

	
	
	
	
//	sum = number1 + number2;
//		
//		System.out.println("Tulos on " + sum);			
//			if (sum > 10)
//			{
//				System.out.println ("Tulos on yli 10. Tulos on " + sum);
//			}

	}	
}	

