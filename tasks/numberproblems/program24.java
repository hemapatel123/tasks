package tasks.numberproblems;
import java.util.Scanner;

public class program24 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int sumOfDivisors = 0;

	        // Finding the sum of proper divisors
	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sumOfDivisors += i;
	            }
	        }
	        if (sumOfDivisors == number) {
	            System.out.println("Perfect (Sum of divisors is " + sumOfDivisors + ", equal to " + number + ")");
	        } else if (sumOfDivisors > number) {
	            System.out.println("Abundant (Sum of divisors is " + sumOfDivisors + ", greater than " + number + ")");
	        } else {
	            System.out.println("Deficient (Sum of divisors is " + sumOfDivisors + ", less than " + number + ")");
	        }
	    }
	}

