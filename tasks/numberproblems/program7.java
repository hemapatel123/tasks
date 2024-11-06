package tasks.numberproblems;
import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a perfect number: ");
        int number = scanner.nextInt();
        boolean isPerfect = isPerfectNumber(number);
        if (isPerfect) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;

        // Find divisors of n and calculate their sum
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // A number is perfect if the sum of its divisors equals the number itself
        return sum == n;
    }
}

		

