package task.stringproblems;
import java.util.Scanner;
import java.util.Arrays;

public class program18 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();
	        if (areAnagrams(str1, str2)) {
	            System.out.println("Anagrams");
	        } else {
	            System.out.println("Not Anagrams");
	        }
	        }
	    public static boolean areAnagrams(String str1, String str2) {
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        return Arrays.equals(arr1, arr2);
	    }
	}
