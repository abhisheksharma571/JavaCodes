package Array;
//To find the majority element in an array nums of size n, where the majority element is defined as an element that appears more than n/2 times,
// you can use the Boyer-Moore Voting Algorithm. This algorithm is efficient, with a time complexity of O(n) and a space complexity of O(1).
public class majorityElement {
    public int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        majorityElement solution = new majorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The majority element is: " + solution.findMajorityElement(nums));
    }
}