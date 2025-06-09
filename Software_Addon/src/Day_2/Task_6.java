package Day_2;
import java.util.Arrays;
public class Task_6 {
	public static void main(String args[]) {
		int arr[] = {4,5,2,6,9,10};
		int left =0;
		int right = arr.length-1;
		while((arr[left]+arr[right])!=8) {
			if(arr[left]<arr[right]) {
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {				
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
