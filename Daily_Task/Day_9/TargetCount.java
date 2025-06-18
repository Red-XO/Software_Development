package Day_8;

import java.util.Scanner;

public class Count {
	public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static int countFrequency(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);
        if (first == -1) return 0;
        int last = findLastOccurrence(arr, target);
        return last - first + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target");
        int target = sc.nextInt();
        System.out.println("Frequency of " + target + " is: " + countFrequency(arr, target));
        sc.close();
    }
}
