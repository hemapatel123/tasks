package task.stringproblems;
import java.util.Scanner;
public class program11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	        System.out.print("Enter the substring: ");
	        String substring = scanner.nextLine();

	        int position = mainString.indexOf(substring);	       
	        if (position != -1) {
	            System.out.println("Found at position: " + position);
	        } else {
	            System.out.println("Substring not found.");
	        }
	}

}
