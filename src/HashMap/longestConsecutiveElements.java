package HashMap;

import java.util.HashSet;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
public class longestConsecutiveElements {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) st.add(num);
        int maxStreak = 0;
        for (int num : st) {
            if (!st.contains(num - 1)) {    //num is starting point of a sequence
                int currNum = num;
                int currStreak = 1;     //length of current consecutive sequence
                while (st.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int longestLength = longestConsecutive(nums);
        System.out.println(longestLength);
    }
}
