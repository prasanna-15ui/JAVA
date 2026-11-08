
public class RecursiveBinary {

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int low, int high) {

        // Base condition
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        // Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Search right half
        else if (target > nums[mid]) {
            return binarySearch(nums, target, mid + 1, high);
        }

        // Search left half
        else {
            return binarySearch(nums, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {

        RecursiveBinary obj = new RecursiveBinary();

        int[] nums = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int result = obj.search(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
