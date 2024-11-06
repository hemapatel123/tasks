package tasks.numberproblems;
import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfSquares = calculateSumOfSquares(number);
        System.out.println("The sum of squares of the digits is: " + sumOfSquares);

        scanner.close();
    }
    public static int calculateSumOfSquares(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;        // Get the last digit
            sum += digit * digit;        // Add the square of the digit to sum
            num = num / 10;              // Remove the last digit
        }

        return sum;
    }
}
