package task.stringproblems;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int length = 0;
	        for (char ch : input.toCharArray()) {
	            length++;
	        }

	        System.out.println("The length of the string is: " + length);
	      }

}
