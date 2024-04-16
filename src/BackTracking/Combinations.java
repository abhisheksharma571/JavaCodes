package BackTracking;

import java.util.ArrayList;
import java.util.List;

//Leetcode - Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void helper(int n, int k, int idx, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = idx; i <= n; i++) {
            current.add(i);
            helper(n, k, i + 1, current, result);
            current.remove(current.size() - 1); // backtracking
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        List<List<Integer>> combinations = combine(n, k);
        System.out.println(combinations);
    }
}

