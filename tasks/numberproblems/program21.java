package tasks.numberproblems;
import java.util.Scanner;

public class program21 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the starting number of the range: ");
	        int start = scanner.nextInt();
	        System.out.print("Enter the ending number of the range: ");
	        int end = scanner.nextInt();

	        int sum = 0;
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) {
	                sum += i;
	            }
	        }

	        System.out.println("Sum of prime numbers between " + start + " and " + end + " is: " + sum);
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	}

