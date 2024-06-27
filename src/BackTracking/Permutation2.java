package BackTracking;

import java.util.ArrayList;
import java.util.List;

//[Leet-Code-46] Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
//using backtracking
public class Permutation2 {
//    public static void helper(int[] nums, List<Integer> ds, boolean[] isValid, List<List<Integer>> ans){
//        int n = nums.length;
//        if(ds.size() == n){
//            List<Integer> list = new ArrayList<>();
//            for(int i=0;i<ds.size();i++){
//                list.add(ds.get(i));
//            }
//            ans.add(list);
//            return;
//        }
//        for(int i=0;i<n;i++){
//            if(isValid[i]==false){
//                ds.add(nums[i]);
//                isValid[i] = true;     //visited
//                helper(nums,ds,isValid,ans);
//                //backtracking
//                isValid[i] = false;
//                ds.remove(ds.size()-1);
//            }
//        }
//    }
//    public static List<List<Integer>> permute(int[] nums){
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> ds = new ArrayList<>();
//        boolean[] isValid = new boolean[nums.length];     //by default false
//        helper(nums,ds,isValid,ans);
//        return ans;
//    }
    public static void helperOptimised(int[] nums,int idx, List<List<Integer>> ans){
         int n = nums.length;
        if(idx==n-1){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        for(int i=idx;i<n;i++){
            swap(i,idx,nums);
            helperOptimised(nums,idx+1,ans);
            //backtracking
            swap(i,idx,nums);
        }
    }
    public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<List<Integer>> permuteOptimised(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        helperOptimised(nums,0,ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,3};
//        List<List<Integer>> answer = permute(nums);
//        System.out.println(answer);

        List<List<Integer>> answerOptimised = permuteOptimised(nums);
        System.out.println(answerOptimised);

    }
}
