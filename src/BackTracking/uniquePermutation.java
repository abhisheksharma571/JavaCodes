package BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class uniquePermutation {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    public static void helper(int[] nums, int idx, List<List<Integer>> ans) {
        int n = nums.length;
        if (idx == n - 1) {
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        Set<Integer> swapped = new HashSet<>();
        for (int i = idx; i < n; i++) {
            if (swapped.contains(nums[i])) {
                continue; // Skip if this element has been swapped before at the same index
            }
            swap(i, idx, nums);
            helper(nums, idx + 1, ans);
            // Backtracking
            swap(i, idx, nums);
            swapped.add(nums[i]);
        }
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        List<List<Integer>> answer = permute(nums);
        System.out.println(answer);
    }
}
