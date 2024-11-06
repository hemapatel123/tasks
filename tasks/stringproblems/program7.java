package task.stringproblems;
import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        System.out.print("Character to replace: ");
		        char charToReplace = scanner.next().charAt(0);

		        System.out.print("Replacement character: ");
		        char replacementChar = scanner.next().charAt(0);
		        String replacedString = input.replace(charToReplace, replacementChar);
		        System.out.println("Output: " + replacedString);
		   }

}
