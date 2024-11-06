package tasks.numberproblems;
import java.util.Scanner;
public class program22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int count = 0;  // Count of prime numbers found
        int num = 2;    // Starting number to check for primes

        // Loop to find the Nth prime number
        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            if (count < n) {
                num++;
            }
        }

        System.out.println("The " + n + "th prime number is: " + num);
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
