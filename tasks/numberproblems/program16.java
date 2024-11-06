package tasks.numberproblems;
import java.util.Scanner;

public class program16 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int product = calculateProductOfDigits(number);
	        System.out.println("The product of the digits is: " + product);
	    }

	    // Method to calculate the product of the digits
	    public static int calculateProductOfDigits(int num) {
	        int product = 1; // Initialize product to 1 (multiplicative identity)

	        while (num > 0) {
	            int digit = num % 10;    // Get the last digit
	            product *= digit;        // Multiply the digit to the product
	            num /= 10;               // Remove the last digit
	        }
	        return product; // Return the final product
	    }
	}


