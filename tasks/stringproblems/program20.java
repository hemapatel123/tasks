package task.stringproblems;
import java.util.Scanner;
public class program20 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a set of digits: ");
	        String input = scanner.nextLine();
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            result.append(input.charAt(i));
	            if (i < input.length() - 1) {
	                result.append("-");
	            }
	        }
	        System.out.println("Output: " + result.toString());
	}

}
