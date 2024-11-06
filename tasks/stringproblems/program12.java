package task.stringproblems;
import java.util.Scanner;
public class program12 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();
	        String[] words = input.split(" ");
	        StringBuilder capitalizedSentence = new StringBuilder();
	        for (String word : words) {
	            if (word.length() > 0) {
	                String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
	                capitalizedSentence.append(capitalizedWord).append(" ");
	            }
	        }
	        System.out.println("Output: " + capitalizedSentence.toString().trim());
	        }

}
