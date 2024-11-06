package task.stringproblems;
import java.util.Scanner;
public class program21 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (result.indexOf(String.valueOf(currentChar)) == -1) {
	                result.append(currentChar);
	            }
	        }

	        System.out.println("Output: " + result.toString());

	}

}
