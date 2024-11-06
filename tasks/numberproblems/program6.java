package tasks.numberproblems;
import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);

    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

	