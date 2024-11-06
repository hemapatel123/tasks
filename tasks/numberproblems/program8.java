package tasks.numberproblems;
import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		 	System.out.print("Enter a number to check if it is prime: ");
	        int number = scanner.nextInt();
	        boolean isPrime = isPrime(number);
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int n) {
	        // Numbers less than 2 are not prime
	        if (n <= 1) {
	            return false;
	        }
	        
	        // Check for divisors up to the square root of n
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false; // n is divisible by i, so it is not prime
	            }
	        }
	        
	        return true; // No divisors found, n is prime
	    }
	}

	