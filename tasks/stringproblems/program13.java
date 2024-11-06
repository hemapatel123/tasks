package task.stringproblems;
import java.util.Scanner;
public class program13 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        // Checking if the string contains only alphabetic characters
	        if (input.chars().allMatch(Character::isLetter)) {
	            System.out.println("Contains only alphabetic characters");
	        } else {
	            System.out.println("Contains non-alphabetic characters");
	        }
	}

}
