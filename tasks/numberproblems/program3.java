package tasks.numberproblems;
import java.util.Scanner;


public class program3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int temp = a;
		int b = 0;
		int result = 0;
		while(temp > 0) {
			b = temp % 10;
			b = (int) Math.pow(b,3);
			result = result + b;
			temp = temp / 10; 
		}
		if (result == a){
			System.out.println("\nGiven number:"+a+ (result==a));
		}
		else {
		 System.out.println("\nIt's not a Armstrong number, it results: "+ result);
		 }
	}

}
