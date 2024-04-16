package BackTracking;

public class subsetEqualProduct {

    public static boolean isProductEqual(int[] nums, int target) {
        return backtrack(nums, 0, 1, target);
    }

    public static boolean backtrack(int[] nums, int index, int currentProduct, int target) {
        if (index == nums.length) {
            return currentProduct == target;
        }

        // Include the current element in the subset
        if (backtrack(nums, index + 1, currentProduct * nums[index], target)) {
            return true;
        }

        // Exclude the current element from the subset
        if (backtrack(nums, index + 1, currentProduct, target)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 5, 4};
        int target = 16;
        if (isProductEqual(nums, target)) {
            System.out.println("Output: YES");
        } else {
            System.out.println("Output: NO");
        }
    }
}
