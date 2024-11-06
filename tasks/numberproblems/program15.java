package tasks.numberproblems;
import java.util.Scanner;
public class program15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0; // Returns true if num is even
    }
}

