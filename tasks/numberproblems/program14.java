package tasks.numberproblems;
import java.util.Scanner;

public class program14 {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
		 	System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int result = digitalRoot(number);
	        System.out.println("The result is: " + result);

	    }

	    // Method to calculate the digital root
	    public static int digitalRoot(int num) {
	        while (num >= 10) { // Repeat until num is a single digit
	            num = sumOfDigits(num); // Sum the digits
	        }
	        return num; // Return the single digit result
	    }

	    // Method to sum the digits of a number
	    public static int sumOfDigits(int num) {
	        int sum = 0;
	        while (num > 0) {
	            sum += num % 10; // Add the last digit to sum
	            num /= 10;       // Remove the last digit
	        }
	        return sum; // Return the total sum of digits
	    }
	}


	