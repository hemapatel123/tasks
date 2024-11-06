package task.stringproblems;
import java.util.Scanner;
public class program26 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();
	        String[] words = input.split(" ");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            result.append(reversedWord.reverse().toString()).append(" ");
	        }
	        System.out.println("Output: " + result.toString().trim());
	      }

}
