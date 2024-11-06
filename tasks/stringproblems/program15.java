package task.stringproblems;
import java.util.Scanner;
public class program15 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int letterCount = 0;
	        int digitCount = 0;
	        int specialCount = 0;
	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                letterCount++;
	            } else if (Character.isDigit(ch)) {
	                digitCount++;
	            } else {
	                specialCount++;
	            }
	        }

	        System.out.println("Letters: " + letterCount + ", Digits: " + digitCount + ", Special characters: " + specialCount);
	}
}
