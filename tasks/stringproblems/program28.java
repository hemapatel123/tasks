package task.stringproblems;
import java.util.Scanner;
public class program28 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        StringBuilder digits = new StringBuilder();
	        for (char ch : input.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                digits.append(ch);
	            }
	        }
	        System.out.println("Output: " + digits.toString());
	    }

}
