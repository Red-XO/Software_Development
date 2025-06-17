package Day_7;
import java.util.Arrays;
public class BubbleSort {
	int[] arr= {23,3,7,44,55,2,9};
	int sample=arr.length-1;
	public void bubble() {
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<sample;i++) {
			for(int j=0;j<sample;j++) {
				if(arr[j]>arr[j+1]) {
					int k=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String []args) {
		BubbleSort a=new BubbleSort();
		a.bubble();
	}
}
