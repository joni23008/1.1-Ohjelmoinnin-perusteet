import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		
		int lampotila;
		lampotila = 16;
		System.out.println(lampotila);
		
		//jos tiedetään montako niin taulukko jos ei niin lista
		int [] lampotilat = new int [7];
		
		lampotilat[0] = 18;
		lampotilat[1] = 28;
		lampotilat[2] = 20;
		lampotilat[3] = 30;
		lampotilat[4] = 22;
		lampotilat[5] = 15;
		lampotilat[6] = 24;
		
		System.out.println(lampotilat[2]);
		
		
		//kokotaulukon tulostus
		
		int summa = 0;
		
		for (int i = 0; i < lampotilat.length ; i++)
		{
//				System.out.println (lampotilat[i]);	
				System.out.println((i+1) + ". solun arvo on " + lampotilat[i]);
				summa = summa + lampotilat [i];
		}
			
		System.out.println(summa);
		
		Arrays.sort(lampotilat);
		
		for (int i = 0; i < lampotilat.length ; i++)
		{
	
				System.out.println(lampotilat[i]);
				
		}
		System.out.println("pienin " + lampotilat [0]);
		System.out.println("isoin " + lampotilat [lampotilat.length-1]);
		
		
		
		
		
		
		
		
		
	}

}
