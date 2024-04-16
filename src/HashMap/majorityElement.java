package HashMap;
//find the majority element in an array nums of size n, where the majority element is defined as an element that appears more than n/2 time
//This method has a time complexity of O(n) but a higher space complexity of O(n) due to the use of a HashMap to store the count of each element.
//solved efficiently by array
import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public int findMajorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
            if (counts.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        majorityElement solution = new majorityElement();
        int[] nums = {4,2,7,1,9};
        System.out.println("The majority element is: " + solution.findMajorityElement(nums));
    }
}
