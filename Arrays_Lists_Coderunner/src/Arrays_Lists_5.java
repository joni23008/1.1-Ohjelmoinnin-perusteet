import java.util.Arrays;
public class Arrays_Lists_5 {

	public static void main(String[] args) {
//		Create an app. Create an array that has values: 16, 18, 5, 3, 10.
//		Find the smallest value and print it. Make sure you test the app in IDE with different array values. 


		        // Create an array of numbers
		        int[] numbers = {16, 18, 5, 3, 10};

		        // Find the lowest number
		        int lowest = findLowestNumber(numbers);

		        // Print the lowest number
		        System.out.println(lowest);
		    }

		    // Function to find the lowest number in an array
		    public static int findLowestNumber(int[] arr) {
		        if (arr.length == 0) {
		            throw new IllegalArgumentException("The array is empty");
		        }

		        int lowest = arr[0]; // Assume the first element is the lowest

		        // Iterate through the array to find the lowest number
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < lowest) {
		                lowest = arr[i];
		            }
		        }

		        return lowest;
		    }
		}