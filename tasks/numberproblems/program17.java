package tasks.numberproblems;
import java.util.Scanner;
public class program17 {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
		 	System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();
	        int hcf = findHCF(num1, num2, num3);

	        System.out.println("The HCF of " + num1 + ", " + num2 + ", and " + num3 + " is: " + hcf);	    }

	    // Method to find GCD of two numbers
	    public static int findGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a; // Return the GCD
	    }

	    // Method to find HCF of three numbers
	    public static int findHCF(int num1, int num2, int num3) {
	        int hcfOfFirstTwo = findGCD(num1, num2); // Find GCD of the first two numbers
	        return findGCD(hcfOfFirstTwo, num3);      // Find GCD of the result with the third number
	    }
	}


