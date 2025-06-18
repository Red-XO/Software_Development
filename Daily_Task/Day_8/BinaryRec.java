package Day_8;
import java.util.Scanner;
public class BinaryRec {
	    public int binarySearch(int target) {
	    	int arr[] = {2, 3, 4, 10, 40};
	    	int left = 0; 
	        int right = arr.length - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                return mid;
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1;
	    }
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        BinaryRec br = new BinaryRec();
	        System.out.println("Enter the Number to find");
	    	int target = sc.nextInt();
	        int result = br.binarySearch(target);
	        if (result == -1) {
	            System.out.println("Element not found");
	        }
	        else {
	            System.out.println("Element found at index: " + result);
	        }
	        sc.close();
	    }
}
