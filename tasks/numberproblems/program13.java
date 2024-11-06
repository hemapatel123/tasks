package tasks.numberproblems;
import java.util.Scanner;

public class program13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find its divisors: ");
        int number = scanner.nextInt();
        System.out.print("The divisors of " + number + " are: ");
        findDivisors(number);

    }

    // Method to find and print the divisors of a number
    public static void findDivisors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
