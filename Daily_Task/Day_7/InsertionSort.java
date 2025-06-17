package Day_7;
public class InsertionSort {
	public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] myArray = { 7, 4, 10, 2, 8 };
        System.out.println("Before sorting:");
        printArray(myArray);
        insertionSort(myArray);
        System.out.println("After sorting:");
        printArray(myArray);
    }
}
