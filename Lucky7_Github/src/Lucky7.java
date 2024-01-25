import java.util.Random;
import java.util.Scanner;
public class Lucky7 {
	public static void main(String[] args) {
//		Vaihe 1
//
//		Tee peli, joka arpoo 3 numeroa väliltä 1-10 ja tulostaa numerot. 
//		Jos joku numeroista on seitsemän, kerro käyttäjälle, että voitit. 
//		Jos mikään ei ole seitsemän, kerro käyttäjälle, että hävisit. Lopuksi ohjelma loppuu.
//		
//
//		Vaihe 2 Jatka peliä esim. seuraavasti:
//
//		· Lisää rahat peliin. Käyttäjällä on alussa 5 € rahaa. Joka peli maksaa euron. 
//		Jos yksi arvotuista numeroista on seitsemän, pelaaja voittaa vaikka 3 €. 
//		Jos kaksi numeroa on seitsemän, hän voittaa 5 euroa jne. Kun kaikki rahat ovat loppuneet, peli loppuu.
//
//		· Tarvitset siis jonkinlaisen toistorakenteen...
//
//		· Jos menet ihan sekaisin ehtorakenteissa, tehtävänannon lopussa on linkki vuokaavioon.
//
//		
//		Vaihe 3 Jatka peliä esim. seuraavasti:
//
//		· Pelaaja voi alussa syöttää rahamäärän, jolla pelaa.
//
//		· Yhden pelikerran jälkeen kysytään: 
//		"Haluatko pelata uudestaan? Jos haluat pelata, paina Enter. Jos et halua pelata, kirjoita e ja paina Enter."

		Random random = new Random();
		Scanner in = new Scanner(System.in);
// Variables
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		int money;
		String deposit;
		String playAgain;
// Money deposit request
		System.out.println("Insert Money");
		deposit = in.nextLine();
		money = Integer.parseInt(deposit);
// Do-While Loop
		do
		{
//Random number slots
		randomNumber1 = random.nextInt(10) + 1;
			System.out.print("| " + randomNumber1 + " |");
		randomNumber2 = random.nextInt(10) + 1;
			System.out.print("| " + randomNumber2 + " |");
		randomNumber3 = random.nextInt(10) + 1;
			System.out.println("| " + randomNumber3 + " |" + "\n");
//Cost of playing
			money = money -1;
//You Win Megapot
			if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7)
			{
			System.out.println("You Win Megapot 10€!" + "\n");
			money = money +10;
			}
//You Win Big
				else if (randomNumber1 == 7 && randomNumber2 ==7)
				{
				System.out.println("You Win Big 5€!" + "\n");
				money = money +5;
				}
				else if (randomNumber2 == 7 && randomNumber3 == 7) 
				{
				System.out.println("You Win Big 5€!" + "\n");
				money = money +5;
				}
				
				else if (randomNumber1 == 7 && randomNumber3 == 7) 
				{
				System.out.println("You Win Big 5€!" + "\n");
				money = money +5;
				}
//You Win
					else if (randomNumber1 == 7) 
					{
					System.out.println("You Win 3€!" + "\n");
					money = money +3;
					}
					else if (randomNumber2 == 7) 
					{
					System.out.println("You Win 3€!" + "\n");
					money = money +3;
					}
					else if (randomNumber3 == 7) 
					{
					System.out.println("You Win 3€!" + "\n");
					money = money +3;
					}
//You Lose	
				else
				{
				System.out.println("You Lose 1€..." + "\n");
				}
//Money you have
			System.out.println("Money = " + money + "€" + "\n");
//Play Again?
			System.out.println("Play Again?" + "\n" + "( y / n )");
			playAgain = in.nextLine();
		}
// Loop ends
		while (playAgain.equals("y") && money > 0);
		
			System.out.println("Thank you for playing!");
	}

}

