package Day_6;
import java.util.Arrays;
import java.util.Scanner;
public class Task_1 {
	int top =-1;
	public void push(int arr[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter a value to push:");
			int val = sc.nextInt();
			if(top==4) {
				System.out.println("Stack Overflow");
			}
			else {
				arr[++top]=val;
			}
		}
		sc.close();
	}
	public void pop(int arr[]){
		 int[] newArr = Arrays.copyOfRange(arr, 0, arr.length-1);
		 System.out.println(Arrays.toString(newArr));
	   	    }
	public void display(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Task_1 ts = new Task_1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Stack:");
		int a = sc.nextInt();
		int arr[] = new int[a];
		ts.push(arr);
		ts.display(arr);
		ts.pop(arr);
		sc.close();
		}
	}
