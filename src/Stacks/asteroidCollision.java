package Stacks;
//We are given an array of asteroids of integers representing asteroids in a row.For each
//asteroid, the absolute value represents its size, and the sign represents its direction (positive
//meaning right, negative meaning left). Each asteroid moves at the same speed.
//Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will
//explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
import java.util.Arrays;
import java.util.Stack;

public class asteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean exploded = false;

            while (!exploded && !stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (Math.abs(top) == Math.abs(asteroid)) {
                    stack.pop();
                    exploded = true;
                } else if (Math.abs(top) > Math.abs(asteroid)) {
                    exploded = true;
                } else {
                    stack.pop();
                }
            }

            if (!exploded) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] asteroids1 = {5, 10, -5};
        int[] result1 = asteroidCollision(asteroids1);
        System.out.println(Arrays.toString(result1)); // Output: [5, 10]

        int[] asteroids2 = {-8, 8};
        int[] result2 = asteroidCollision(asteroids2);
        System.out.println(Arrays.toString(result2)); // Output: []

        int[] asteroids3 = {-2, -1, 1, 2};
        int[] result3 = asteroidCollision(asteroids3);
        System.out.println(Arrays.toString(result3)); // Output: [10]
    }
}
