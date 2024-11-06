package tasks.numberproblems;
import java.util.Scanner;

public class program28 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	        double sqrt = findSquareRoot(number);

	        System.out.println("The square root of " + number + " is approximately: " + sqrt);
	    }

	    public static double findSquareRoot(double n) {
	        double guess = n;
	        double epsilon = 1e-6; // precision threshold

	        while (Math.abs(guess * guess - n) > epsilon) {
	            guess = (guess + n / guess) / 2.0;
	        }

	        return guess;
	    }
	}
