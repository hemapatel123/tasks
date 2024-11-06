package task.stringproblems;
import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a word or sentence: ");
		        String input = scanner.nextLine();
		        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
		        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

		        if (cleanedInput.equals(reversedInput)) {
		            System.out.println("Palindrome");
		        } else {
		            System.out.println("Not a palindrome");
		        }
	}

}
