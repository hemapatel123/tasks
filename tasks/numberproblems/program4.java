package tasks.numberproblems;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = in.nextInt();
		int originalNumber = a;
        int reversedNumber = 0;
        while (a!= 0) {
            int lastDigit = a % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            a = a / 10;
        }

       
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

	}

}
