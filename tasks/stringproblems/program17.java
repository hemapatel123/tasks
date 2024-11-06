package task.stringproblems;
import java.util.Scanner;
public class program17 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        StringBuilder swappedCaseString = new StringBuilder();
	        for (char ch : input.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                swappedCaseString.append(Character.toLowerCase(ch));
	            } else if (Character.isLowerCase(ch)) {
	                swappedCaseString.append(Character.toUpperCase(ch));
	            } else {
	                swappedCaseString.append(ch); // For non-alphabet characters
	            }
	        }
	        System.out.println("Output: " + swappedCaseString.toString());
	}

}
