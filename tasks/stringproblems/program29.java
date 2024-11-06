package task.stringproblems;
import java.util.Scanner;
public class program29 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0, specialCount = 0;
	        for (char ch : input.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                uppercaseCount++;
	            } else if (Character.isLowerCase(ch)) {
	                lowercaseCount++;
	            } else if (Character.isDigit(ch)) {
	                digitCount++;
	            } else {
	                specialCount++;
	            }
	        }
	        System.out.println("Uppercase: " + uppercaseCount);
	        System.out.println("Lowercase: " + lowercaseCount);
	        System.out.println("Digits: " + digitCount);
	        System.out.println("Special characters: " + specialCount);

	    
	}

}
