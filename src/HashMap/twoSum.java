package HashMap;

import java.util.HashMap;

//Given an array of length n and a target, return a pair(indices) whose sum is equal to the target. If there is no pair present, return -1.
public class twoSum {
    public static int[] twoSumSolution(int[] nums, int target){
        int n = nums.length;;
        int[] ans = {-1};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j] == target - nums[i]){
                    ans = new int[]{i,j};
                    return ans;
                }
            }
        }
        return ans;
    }
    public static int[] twoSumOptimised(int[] nums, int target){
        int n = nums.length;
        int[] ans = {-1};
        //value, index
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++) {
            int partner = target - nums[i];
            if (mp.containsKey(partner)) {
                ans = new int[]{i, mp.get(partner)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {14,7,10,4,5,9,1,2};
        int x = 13;
        int[] indices = twoSumOptimised(arr,x);
        System.out.print("Indices are: ");
        for(int index : indices){
            System.out.print(index+" ");
        }
    }
}
