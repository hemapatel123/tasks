package task.stringproblems;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class program30 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        for (char ch : input.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }
	        char mostFrequentChar = '\0';
	        int maxCount = 0;
	        
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                mostFrequentChar = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }
	        System.out.println("Most frequent character: " + mostFrequentChar + " (appears " + maxCount + " times)");
		}

}
