package Day_8;
import java.util.Arrays;
import java.util.Scanner;
public class Tas_2 {
	int arr[] = {32,43,67,34,23,12,78};
	int low = 0;
	int high = arr.length-1;
	public void finder(int num) {
		Arrays.sort(arr);
		int mid = (low+high)/2;
		if(arr[mid]==num) {
			System.out.println(Arrays.toString(arr));
			System.out.println("Value "+arr[mid]+ " found at "+mid);
			return;
		}else {
		if(num<arr[mid]) {
			high--;
			finder(num);
		}
		else {
			low++;
			finder(num);
			}
		}
		}
	public static void main(String[] args) {
		Tas_2 ts = new Tas_2();
		Scanner ac = new Scanner(System.in);
		System.out.println("Enter the Number to find in the Array");
		int find = ac.nextInt();
		ts.finder(find);
		ac.close();
	}
}
