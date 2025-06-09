package Day_1;
import java.util.Scanner;
public class Task_8 {
	public static void displayArray(int[] arr, int size) {
	        System.out.print("Array Elements: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static int insertElement(int[] arr, int size, int elem, int pos) {
	        for (int i = size; i > pos; i--) {
	            arr[i] = arr[i - 1];
	        }
	        arr[pos] = elem;
	        System.out.println("Element inserted successfully.");
	        return size + 1;
	    }

	    public static int deleteElement(int[] arr, int size, int pos) {
	        for (int i = pos; i < size - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        System.out.println("Element deleted successfully.");
	        return size - 1;
	    }

	    public static void searchElement(int[] arr, int size, int elem) {
	        for (int i = 0; i < size; i++) {
	            if (arr[i] == elem) {
	                System.out.println("Element found at position: " + i);
	                return;
	            }
	        }
	        System.out.println("Element not found.");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[100];
	        int size = 0;
	        while(true) {
	            System.out.println("1. Insert Element");
	            System.out.println("2. Delete Element");
	            System.out.println("3. Search Element");
	            System.out.println("4. Display Array");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element to insert: ");
	                    int element = sc.nextInt();
	                    System.out.print("Enter position to insert (0-based index): ");
	                    int position = sc.nextInt();
	                    size = insertElement(arr, size, element, position);
	                    break;

	                case 2:
	                    System.out.print("Enter position to delete (0-based index): ");
	                    position = sc.nextInt();
	                    size = deleteElement(arr, size, position);
	                    break;

	                case 3:
	                    System.out.print("Enter element to search: ");
	                    element = sc.nextInt();
	                    searchElement(arr, size, element);
	                    break;

	                case 4:
	                    displayArray(arr, size);
	                    break;

	                case 5:
	                    System.out.println("Varta mame durr ");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	            }
	    }
	}


