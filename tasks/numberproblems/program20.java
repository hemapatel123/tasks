package tasks.numberproblems;
import java.util.Scanner; 

public class program20 {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
		 	System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int digitCount = countDigits(number);
	        System.out.println("The number of digits in " + number + " is: " + digitCount);

	    }

	    // Method to count the number of digits in a number
	    public static int countDigits(int num) {
	        // Handle negative numbers by taking the absolute value
	        num = Math.abs(num);
	        
	        // If the number is zero, it has 1 digit
	        if (num == 0) {
	            return 1;
	        }
	        
	        int count = 0;
	        while (num > 0) {
	            num /= 10; // Remove the last digit
	            count++;   // Increment the digit count
	        }
	        return count; // Return the total digit count
	    }
	}


