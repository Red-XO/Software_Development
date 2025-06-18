package Day_9;
public class LowerBound {
	public static int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid; 
            } else {
                left = mid + 1;
            }
        }
        return left; 
	}
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 7, 8, 10};
        int target = 7;
        int lowerBoundIndex = lowerBound(nums, target);
        System.out.println("Lower bound index: " + lowerBoundIndex);
    }
}
