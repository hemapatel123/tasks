package tasks.numberproblems;
import java.util.Scanner;

public class program30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isStrong = checkStrongNumber(number);
        System.out.println("Is " + number + " a strong number? " + isStrong);
        }
    public static boolean checkStrongNumber(int num) {
        int originalNumber = num;
        int sumOfFactorials = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}