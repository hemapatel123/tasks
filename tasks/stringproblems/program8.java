package task.stringproblems;
import java.util.Scanner;
public class program8 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        System.out.print("Character to count: ");
	        char charToCount = scanner.next().charAt(0);

	        int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == charToCount) {
	                count++;
	            }
	        }
	        System.out.println("Output: " + count);
	}

}
