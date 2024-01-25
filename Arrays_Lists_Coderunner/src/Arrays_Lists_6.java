import java.util.ArrayList;
		import java.util.Collections;
public class Arrays_Lists_6 {
	

	public static void main(String[] args) {

		
		    
		        // Create an ArrayList of cars
		        ArrayList<String> cars = new ArrayList<>();
		        cars.add("Kia");
		        cars.add("Tesla");
		        cars.add("BMW");
		        cars.add("Renault");

		        // Print the original ArrayList
		        
		        for (String car : cars) {
		            System.out.println(car);
		        }

		        // Insert "Ford" after "Kia"
		        int kiaIndex = cars.indexOf("Kia");
		        cars.add(kiaIndex + 1, "Ford");

		        // Delete "Tesla"
		        cars.remove("Tesla");

		        // Change "BMW" to "Audi"
		        int bmwIndex = cars.indexOf("BMW");
		        cars.set(bmwIndex, "Audi");

		        // Print "MODIFIED LIST"
		        System.out.println("MODIFIED LIST");

		        // Print the modified ArrayList
		        for (String car : cars) {
		            System.out.println(car);
		        }

		        // Sort the ArrayList
		        Collections.sort(cars);

		        // Print "SORTED LIST"
		        System.out.println("SORTED LIST");

		        // Print the sorted ArrayList
		        for (String car : cars) {
		            System.out.println(car);
		        }
		    }
		}



