import java.util.Arrays;
public class Arrays_Lists_3 {

	public static void main(String[] args) {
//		Modify the code. Loop through the array. Check if the value of the array item is Sofa. If it is, print:
//
//			Sofa found
		
		
		String[] furniture = {"Table", "Sofa", "Shelf", "Painting"};

		
		int i = 0;
		while (i < furniture.length) 
		
		{
		  i++;
		  if (furniture[i].equals("Sofa"))
		  {
			  System.out.println("Sofa found");
			  break; 
		  }
		 
		}
		
		
		
		
		
		
	}

}
