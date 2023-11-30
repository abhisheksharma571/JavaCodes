package Stacks;
//Given a series of N daily price quotes for a stock, we need to calculate the span of the stock's price for all N days. The span of the stock's price
//in one day is the maximum number of consecutive days(starting from that day and going backward) for which the stock price was less than or equal to the price of that day.
import java.util.Stack;

public class stockSpan {

    public static int[] calculateSpan(int[] prices, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ans[0] = 1;
        for(int i=1;i<n;i++){
            while (st.size() > 0 && prices[st.peek()] <= prices[i]){
                st.pop();
            }
            if(st.size() > 0) ans[i] = i-st.peek();
            else ans[i] = i+1;
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int n = prices.length;;
        int[] span = calculateSpan(prices, n);

        for (int i = 0; i < span.length; i++) {
            System.out.println("Span on day " + i + ": " + span[i]);
        }
    }
}
