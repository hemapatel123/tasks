package tasks.numberproblems;
import java.util.Scanner;

public class program23 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int largestPrimeFactor = 1;

	        // Finding the largest prime factor
	        for (int i = 2; i <= number; i++) {
	            while (number % i == 0) {
	                largestPrimeFactor = i;
	                number /= i;
	            }
	        }

	        System.out.println("The largest prime factor is: " + largestPrimeFactor);
	        scanner.close();
	    }
	}
		
