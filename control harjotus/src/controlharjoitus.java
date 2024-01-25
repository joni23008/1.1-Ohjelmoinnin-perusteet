
public class controlharjoitus {
	public static void main(String[] args) {
	
//		boolean kannykkapaalla = false;
//		
//		//ehto
//		// onko kannykka pois paalta (eli false)
//		// aaltosulku elikkäs ohjelmoinnissa lohkosulkeet
//		if (kannykkapaalla == false)
//		{
//			System.out.println("Starting");
//		}
//		
//		else
//		{
//			System.out.println("Shutdown");
//		}
//		
		
		
		
		
		//1. TEHTÄVÄ Tee kaksi muuttujaa ja vaihtele niiden arvoja
		
//		int luku1 = 100;
//		int luku2 = 200;
//		
//
//		if (luku1 == luku2)
//		{
//		System.out.println("luku1 ja luku2 ovat yhtäsuuria");
//		}
//		
//		else if (luku1 > luku2)
//		{
//		System.out.println("luku1 on suurempi kuin luku2");
//		}
//		
//		else if (luku1 >= luku2)
//		{
//		System.out.println("luku1 on suurempi kuin luku2 tai yhtäsuuri");
//		}
//		
//		else if (luku1 < luku2)
//		{
//		System.out.println("luku1 on pienempi kuin luku2");
//		}
		
		
		
		
		
		//2.Tehtävä
		
//				int luku1 = 3;
//				int luku2 = 6;
//				int luku3 = 2;
//				
//				if (luku1 == luku2 && luku2 == luku3)
//				{
//					System.out.println("luku1,luku2 ja luku3 ovat yhtä suuria");
//				}
//				if (luku1 == luku2)
//				{
//					System.out.println("luku1 ja luku2 ovat yhtä suuria");
//				}
//				if (luku2 == luku3)
//				{
//					System.out.println("luku2 ja luku3 ovat yhtä suuria");
//				}
//				if (luku1 > luku2 && luku1 == luku3)
//				{
//					System.out.println("luku1 suurempi kuin luku2 JA luku1 yhtä suuri kuin luku3");
//				}
		
//		Tutki, onko luku1 suurempi kuin luku2. Jos ei ole, tutki onko luku2 suurempi kuin luku3.

//		if (luku1 > luku2)
//		{
//			System.out.println("luku1 suurempi kuin luku2");
//		}
//		else if (luku2 > luku3)
//		{
//			System.out.println("luku2 on suurempi kuin luku3");
//		}
//		
//		Tutki, onko luku1 ja luku2 yhtä suuria. Jos ei ole, tutki, onko luku1 ja luku3 yhtä suuria
		
//		if (luku1 == luku2)
//		{
//			System.out.println("luku1 ja luku2 ovat yhtäsuuria");
//		}
//		else if (luku1 == luku3)
//		{
//			System.out.println("luku1 ja luku3 ovat yhtäsuuria");
//		}
		
		
		
		//3.tehävä
		
		
//		String nimi = "Joni";
//		
//		if (nimi.equals("Joni"))
//		{
//			System.out.println("Nimi on Joni");
//		}
//		
//		else
//		{
//			System.out.println("Nimi ei ole Joni");
//		}
		
		
		
		
//		1. Tutki, onko nimi1 ja nimi2 samoja
//
//		2. Tutki, onko nimi1 ja nimi2 erisuuria ????????
//
//		3. Tutki, onko nimi1 ja nimi2 samoja. Jos ei ole, tutki onko nimi1 ja nimi3 samoja.
		
		
		String nimi1 = "Joni";
		String nimi2 = "Uuno";
		String nimi3 = "Nasse";
		

		if (nimi1.equals(nimi2))
		{
			System.out.println ("Nimi 1 ja nimi 2 ovat samoja");
		}
		
		else
		{
			System.out.println ("Nimi 1 ja nimi 2 EIVÄT ole samoja");
		}
		
		if (nimi1.equals(nimi3))
		{
			System.out.println ("Nimi 1 ja nimi 3 ovat samoja");
		}
		
		else
		{
			System.out.println ("Nimi 1 ja nimi 3 EIVÄT ole samoja");
		}
		
		
		int luku1 = nimi1.length();
		int luku2 = nimi2.length();

		
		if (luku1 == luku2)
		{
			System.out.println("Nimet ovat yhtä suuria");
		}
		
		if (luku1 != luku2)
		{
			System.out.println("Nimet ovat eri suuria");
		}
		
		
		
		
		
	}

}
