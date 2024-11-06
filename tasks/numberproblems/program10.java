package tasks.numberproblems;
import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number (N) to find the sum : ");
        int N = scanner.nextInt();
        // Calculate sum using a loop
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
    }
}

