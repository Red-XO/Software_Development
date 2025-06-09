package Day_2;

import java.util.Scanner;
public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Size of Word:");
		int a = sc.nextInt();
		System.out.println("Word:");
		String arr[] = new String[a];
		int left = 0;
		int right = arr.length-1;
		System.out.println("Enter the numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		while(left<right) {
			if(arr[left]!=arr[right]) {
				System.out.println("Not A palindrome");
			}
		}
		sc.close();
	}

}
