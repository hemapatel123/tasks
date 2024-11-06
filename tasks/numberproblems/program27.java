package tasks.numberproblems;
import java.util.Scanner;

public class program27 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int digitalRoot = findDigitalRoot(number);

	        System.out.println("The digital root of " + number + " is: " + digitalRoot);
	        scanner.close();
	    }

	    // Method to calculate the digital root
	    public static int findDigitalRoot(int num) {
	        while (num >= 10) {
	            int sum = 0;
	            while (num > 0) {
	                sum += num % 10;
	                num /= 10;
	            }
	            num = sum;
	        }
	        return num;
	    }
	}
