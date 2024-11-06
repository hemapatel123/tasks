package task.stringproblems;
import java.util.Scanner;
public class program14 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);	        
		   System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        System.out.print("Character to remove: ");
	        char charToRemove = scanner.next().charAt(0);
	        String output = input.replace(String.valueOf(charToRemove), "");

	        System.out.println("Output: " + output);
	}

}
