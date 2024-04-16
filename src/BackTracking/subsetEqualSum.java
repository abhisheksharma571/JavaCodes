package BackTracking;

public class subsetEqualSum {

    public static boolean canPartition(int[] nums, int k) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % k != 0) {
            return false;
        }
        int targetSum = totalSum / k;
        boolean[] visited = new boolean[nums.length];
        return backtrack(nums, k, 0, 0, targetSum, visited);
    }

    private static boolean backtrack(int[] nums, int k, int startIndex, int currentSum, int targetSum, boolean[] visited) {
        if (k == 1) {
            return true; // All other subsets are found
        }
        if (currentSum == targetSum) {
            // Found one subset, continue searching for k - 1 subsets
            return backtrack(nums, k - 1, 0, 0, targetSum, visited);
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (!visited[i] && currentSum + nums[i] <= targetSum) {
                visited[i] = true;
                if (backtrack(nums, k, i + 1, currentSum + nums[i], targetSum, visited)) {
                    return true; // Found a subset with currentSum equal to targetSum
                }
                visited[i] = false;
            }
        }
        return false; // Couldn't find a subset with currentSum equal to targetSum
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2};
        int k = 2;
        System.out.println(canPartition(arr, k)); // Output: true
    }
}
