package HashMap;
//Detect if an Array contains a duplicate element. At Most 1 duplicate would be there.
import java.util.*;

public class duplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};

        System.out.println("Output: " + containsDuplicate(arr));
    }
    public static String containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {    //add method, which returns a boolean value: true if the element did not exist in the set and was successfully added, and false if the element already exists in the set and was not added.
                return "Yes"; // Duplicate found
            }
        }
        return "No"; // No duplicate found
    }
}
