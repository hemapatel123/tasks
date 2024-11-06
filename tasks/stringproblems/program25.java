package task.stringproblems;
import java.util.Scanner;
public class program25 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        if (input.matches("\\d+")) {
	            System.out.println("Contains only digits");
	        } else {
	            System.out.println("Contains non-numeric characters");
	        }
}
}
