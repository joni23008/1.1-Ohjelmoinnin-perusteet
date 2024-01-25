import java.util.Scanner;

public class Arvioitavat {



	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		 System.out.print("Syötä etunimi: ");

         String etunimi = in.nextLine();

         System.out.print("Syötä sukunimi: ");

         String sukunimi = in.nextLine();

         System.out.print("Syötä yrityksen verkkotunnus: ");

         String verkkotunnus = in.nextLine();



         if(etunimi.isEmpty() || sukunimi.isEmpty() || verkkotunnus.isEmpty()) {

             System.out.println("Virhe! Jokin tiedoista puuttui.");

         } else {

         

        	 String email = generateEmail(etunimi, sukunimi, verkkotunnus);

             System.out.println("Sähköpostiosoite: " + email);

        	 

             String username = generateUsername(etunimi, sukunimi);

             System.out.println("Käyttäjätunnus: " + username);

         

}

}

	public static String generateEmail(String etunimi, String sukunimi, String verkkotunnus) {        

        String email = etunimi + "." + sukunimi + "@" + verkkotunnus;


        email = email.toLowerCase();

        

        return email;

}

	public static String generateUsername(String etunimi, String sukunimi) {

        String username = etunimi.substring(0, Math.min(etunimi.length(), 4))

                + sukunimi.substring(Math.max(sukunimi.length() - 4, 0));

    username = username.toLowerCase();

        

        return username;

}

}

