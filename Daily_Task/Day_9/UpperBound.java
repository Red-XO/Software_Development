package Day_9;
public class UpperBound {
	public static void main(String[] args) {
		UpperBound ub = new UpperBound();
		int[] arr = {10, 20, 30, 40, 50};
        int key = 25;
        int upperBoundIndex = ub.findUpperBound(arr, key);
        if (upperBoundIndex != -1) {
            System.out.println("Upper Bound of " + key + " is: " + arr[upperBoundIndex]);
        } else {
            System.out.println("No upper bound found.");
        }
    }
    public int findUpperBound(int[] arr, int key) {
        int low = 0, high = arr.length;
        int result = -1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > key) {
                result = mid;
                high = mid; 
            } else {
                low = mid + 1;
            }
        }

        return result; 
    }
}
