package tasks.numberproblems;
import java.util.Scanner;

public class program25 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the base number: ");
	        int base = scanner.nextInt();
	        System.out.print("Enter the exponent: ");
	        int exponent = scanner.nextInt();
	        long result = 1;
	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println(base + "^" + exponent + " = " + result);
	    }
	}

