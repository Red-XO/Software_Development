package Day_2;
import java.util.Arrays;
import java.util.Scanner;
public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int c[]=arr;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(c[j]>c[i]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		sc.close();
	}

}
