package Stacks;
//Given a series of N daily price quotes for a stock, we need to calculate the span of the stock's price for all N days. The span of the stock's price
//in one day is the maximum number of consecutive days(starting from that day and going backward) for which the stock price was less than or equal to the price of that day.
import java.util.Stack;

public class stockSpan {

    public static int[] calculateSpan(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        // Initialize the span of the first day as 1
        span[0] = 1;

        // Iterate over the prices array to calculate the span of each day
        for (int i = 1; i < prices.length; i++) {
            // While the stack is not empty and the price of the current day is greater than or equal to the price at the top of the stack, pop the top of the stack
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If the stack is empty, then the span of the current day is the current index + 1
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Otherwise, the span of the current day is the current index - the index at the top of the stack
                span[i] = i - stack.peek();
            }

            // Push the current index into the stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        for (int i = 0; i < span.length; i++) {
            System.out.println("Span on day " + i + ": " + span[i]);
        }
    }
}
