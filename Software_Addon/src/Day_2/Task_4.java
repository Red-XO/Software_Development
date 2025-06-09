package Day_2;
import java.util.Arrays;
public class Task_4 {
	public static void main(String[] args) {
		int arr[] = {2,3,4,4,5,8,2,4};
		int a=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[a]) {
				arr[a]=arr[i];
				a++;
				arr[a+1]=0;
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
