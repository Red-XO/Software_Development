package Day_6;
import java.util.Arrays;
import java.util.Scanner;
public class Task_2 {
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
		Scanner sc = new Scanner(System.in);
		Task_2 ts = new Task_2();
		System.out.println("Enter the Size of the Stack");
		int b = sc.nextInt();
		int arr[] = new int[b];
		System.out.println("Stack Operations");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		System.out.println("Enter Your Choice:");
		int a = sc.nextInt();
		do{
			switch(a) {
			case 1:
				ts.push(arr);
				break;
			case 2:
				ts.pop(arr);
				break;
			case 3:
				ts.display(arr);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Out Of Range");
			}
		sc.close();
		}while(true);
	}
}

