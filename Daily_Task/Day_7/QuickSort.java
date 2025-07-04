package Day_7;
public class QuickSort {
	 public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	            }
	    }
	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;
	        return i + 1;
	    }
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        int[] myArray = { 6, 3, 9, 5, 2, 8 };
	        System.out.println("Before sorting:");
	        printArray(myArray);
	        quickSort(myArray, 0, myArray.length - 1);
	        System.out.println("After sorting:");
	        printArray(myArray);
	    }
}
