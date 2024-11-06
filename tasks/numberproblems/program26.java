package tasks.numberproblems;
import java.util.Scanner;

public class program26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int trailingZeros = 0;

        // Counting factors of 5 in the factorial
        for (int i = 5; number / i >= 1; i *= 5) {
            trailingZeros += number / i;
        }

        System.out.println("The number of trailing zeros in " + number + "! is: " + trailingZeros);
        scanner.close();
    }
}
