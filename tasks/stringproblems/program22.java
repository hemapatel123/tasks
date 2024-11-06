package task.stringproblems;
import java.util.Scanner;
public class program22 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();
	        System.out.print("Enter the word to count: ");
	        String word = scanner.next();
	        String[] words = sentence.split("\\W+");
	        int count = 0;
	        for (String w : words) {
	            if (w.equalsIgnoreCase(word)) {
	                count++;
	            }
	        }
	        System.out.println("Occurrences of '" + word + "': " + count);
	}

}
