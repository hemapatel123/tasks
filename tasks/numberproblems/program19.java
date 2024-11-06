package tasks.numberproblems;
import java.util.Scanner;
public class program19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] sums = calculateSums(number);
        System.out.println("Odd Position Sum: " + sums[0]);
        System.out.println("Even Position Sum: " + sums[1]);
    }

    // Method to calculate sums of digits at odd and even positions
    public static int[] calculateSums(int num) {
        int oddSum = 0;
        int evenSum = 0;
        int position = 1; // Position starts at 1

        while (num > 0) {
            int digit = num % 10; // Get the last digit

            if (position % 2 == 1) {
                oddSum += digit; // Add to odd position sum
            } else {
                evenSum += digit; // Add to even position sum
            }

            num /= 10; // Remove the last digit
            position++; // Increment position
        }

        // Return both sums in an array
        return new int[]{oddSum, evenSum};
    }
}


