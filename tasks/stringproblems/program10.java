package task.stringproblems;
import java.util.Scanner;
public class program10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = input.replaceAll("\\s+", "");
        System.out.println("Output: " + output);
        	}

}
