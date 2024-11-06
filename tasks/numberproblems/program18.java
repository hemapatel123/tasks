package tasks.numberproblems;
import java.util.Scanner;

public class program18 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		boolean answer = false;
		if(number % 2 == 0) {
			answer = true;
			System.out.println("Given number "+number+" is power of 2: "+answer);
		}
		else 
			System.out.println("Given number "+number+" is power of 2: "+answer);
		in.close();
		}
}