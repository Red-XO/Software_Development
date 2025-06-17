package Day_2;
import java.util.Arrays;
public class TwoPointer {
	    public static int[] findPairAndSwap(int[] arr, int target) {
	        Arrays.sort(arr);
	        int left = 0, right = arr.length - 1;
	        while (left < right) {
	            int currentSum = arr[left] + arr[right];
	            if (currentSum == target) {
	                System.out.println("Found: " + arr[left] + " + " + arr[right] + " = " + target);
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                return arr;
	            } else if (currentSum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        System.out.println("No pair found!");
	        return arr;
	    }
	    public static void main(String[] args) {
	        int[] arr = {4, 5, 2, 6, 9, 10};
	        int target = 8;
	        arr = findPairAndSwap(arr, target);
	        System.out.println("Updated Array: " + Arrays.toString(arr));
	    }
	}