package Day_7;
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
	public static void selection(int []a ) {
		System.out.println(Arrays.toString(a));
		for(int j=1;j<a.length;j++){
			for(int i=0;i<a.length-1;i++) {
				if(a[i+1]<a[i]) {
					int temp = a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}
				System.out.println("Output:");
				System.out.println(Arrays.toString(a));
			}
		}
	}
	public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
	System.out.println("Enter a size of arrays:");
	int size=n.nextInt();
	int[]a = new int[size];
	System.out.println("Enter a element of arrays:");
	for(int i=0;i<a.length;i++) {
		int e=n.nextInt();
		a[i]=e;
	}
	selection(a);
	n.close();
}
}
