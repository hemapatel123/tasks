package task.stringproblems;
import java.util.Scanner;
public class program6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();
	        String[] words = input.trim().split("\\s+");
	        int wordCount = words.length;
	        System.out.println("Number of words: " + wordCount);
	 }

}
