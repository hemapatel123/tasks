package task.stringproblems;
import java.util.Scanner;
public class program24 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        String result = input.replaceAll("[aeiouAEIOU]", "");
	        System.out.println("Output: " + result);
	}

}
