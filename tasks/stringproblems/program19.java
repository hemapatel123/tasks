package task.stringproblems;
import java.util.Scanner;
public class program19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }
        System.out.println("Uppercase: " + uppercaseCount + ", Lowercase: " + lowercaseCount);
       }

}
