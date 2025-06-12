package Day_2;
import java.util.Arrays;
public class Task_1 {
	public static void main(String[] args) {
		int arr[]= {4,2,10,7,5,3,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
