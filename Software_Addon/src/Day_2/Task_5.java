package Day_2;
import java.util.Scanner;
public class Task_5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String a = sc.next();
		int left = 0;
		int right = a.length()-1;
		while(left<right) {
			if(a.charAt(left)!=a.charAt(right)) {
				System.out.println("Not a Palindrome");
			}
			else {
				System.out.println("Is a Palindrome");
			}
			left++;
			right--;
		}
		sc.close();
		
	}
}
