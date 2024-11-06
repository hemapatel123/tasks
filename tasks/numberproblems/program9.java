package tasks.numberproblems;
import java.util.Scanner;
public class program9 {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
		 	System.out.print("Enter the position of the Fibonacci sequence (n): ");
	        int n = scanner.nextInt();
	        int fibonacciNumber = findFibonacci(n);
	        System.out.println("The " + n + "-th Fibonacci number is: " + fibonacciNumber);
	        }

	    // Method to find the nth Fibonacci number
	    public static int findFibonacci(int n) {
	        if (n <= 1) {
	            return n; // Base cases: Fibonacci(0) = 0, Fibonacci(1) = 1
	        }

	        int a = 0, b = 1, c = 0;
	        for (int i = 2; i <= n; i++) {
	            c = a + b; // Next Fibonacci number is the sum of the previous two
	            a = b;
	            b = c;
	        }
	        return c;
	    }
	}


	