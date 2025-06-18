package Day_8;
import java.util.Scanner;
public class TypeDetection {
    public static int searchInt(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;

            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
    public static int searchString(String[] arr, String target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid].equals(target)) return mid;

            if (arr[left].compareTo(arr[mid]) <= 0) {
                if (target.compareTo(arr[left]) >= 0 && target.compareTo(arr[mid]) < 0) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target.compareTo(arr[mid]) > 0 && target.compareTo(arr[right]) <= 0) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = { 40, 50, 5, 10, 20, 30 };
        String[] strArray = { "peach", "zebra", "apple", "banana", "cherry", "grape" };
        System.out.print("Enter value to search: ");
        String input = sc.nextLine();
        boolean isNumber = input.matches("-?\\d+");  
        if (isNumber) {
            int num = Integer.parseInt(input);
            int index = searchInt(intArray, num);
            if (index != -1)
                System.out.println("Number found at index " + index);
            else
                System.out.println("Number not found");
        } else {
            String word = input;
            int index = searchString(strArray, word);
            if (index != -1)
                System.out.println("Word found at index " + index);
            else
                System.out.println("Word not found");
        }
        sc.close();
    }
}
