

package dowhilekirjastokortti;
import java.util.Scanner;

public class kirjastokortti {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	String pinkoodivastaus;
	
	do
	{
		System.out.println("Kirjoita Pin-koodi");
		pinkoodivastaus = in.nextLine();
		
		if (pinkoodivastaus.equals("1234"))
		{
			break;
		}
		
	} while (!pinkoodivastaus.equals("1234"));
//		loopataam niin kauan kun pin-koodi on väärin
		
	System.out.println("Koodi oikein");
	}

}
