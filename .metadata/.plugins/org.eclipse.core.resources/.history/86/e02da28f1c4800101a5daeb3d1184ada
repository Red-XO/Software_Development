package Day_1;
import java.util.Arrays;
public class Task_1 {
	public static int[] insertAtPosition(int[] arr, int element, int position) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position!");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0;i < newArr.length; i++) {
        	for(int  j = 0;j<newArr.length;j++) {	
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }
        }
        return newArr;
    }
public static void main(String args[]) {
	    	int[] arr = {10, 20, 30, 40, 50};
	        int element = 25;
	        int position = 2;
	        arr = insertAtPosition(arr, element, position);
	        System.out.println("Updated Array: " + Arrays.toString(arr));
	    }
}
