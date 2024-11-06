package task.stringproblems;
import java.util.Scanner;
public class program9 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        if (input.length() < 2) {
	            System.out.println("String is too short to swap characters.");
	        } else {
	            char firstChar = input.charAt(0);
	            char lastChar = input.charAt(input.length() - 1);
	            String middlePart = input.substring(1, input.length() - 1);

	            String swappedString = lastChar + middlePart + firstChar;
	            System.out.println("Output: " + swappedString);
	        }
	}
}
