package Day_7;

import java.util.Arrays;

public class Task_1 {
	public void Bubblesort(int sample[]) {
		for (int i = 1; i < sample.length; i++) {
			for (int j = 0; j < sample.length-1; j++) {
				if (sample[j]>sample[j+1]) {
					int temp = sample[j];
					sample[j] = sample[j+1];
					sample[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(sample));
	}
	public static void main(String[] args) {
		Task_1 ts = new Task_1();
		int arr[] = {98,76,65,43,24,4,2,6};
		ts.Bubblesort(arr);
	}
}
