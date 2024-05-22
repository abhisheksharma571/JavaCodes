package Stacks;
//You are keeping the scores for a baseball game with strange rules. At the beginning of the
//game, you start with an empty record. You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//An integer x.
//Record a new score of x.
//'+'.
//Record a new score that is the sum of the previous two scores.
//'D'.
//Record a new score that is the double of the previous score.
//'C'.
//Invalidate the previous score, removing it from the record.
//Return the sum of all the scores on the record after applying all the operations.
import java.util.Stack;

public class baseballGame {
    public static int calculatePoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            switch (op) {
                case "+":
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }

        int totalSum = 0;
        for (int score : stack) {
            totalSum += score;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println(calculatePoints(ops1)); // Output: 30

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calculatePoints(ops2)); // Output: 27

        String[] ops3 = {"1", "C"};
        System.out.println(calculatePoints(ops3)); // Output: 0
    }
}

