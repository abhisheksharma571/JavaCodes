package Queue;
//First negative in each window of size 'k'
import java.util.LinkedList;
import java.util.Queue;

public class firstNegativeInWindow {
    public static int[] firstNegativeInWindows(int[] arr, int k, int n) {
        int[] result = new int[n - k + 1];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }
        for (int i = 0; i < n-k+1; i++) {
            // Remove indices that are out of the current window
            if (q.size() > 0 && q.peek() < i) q.remove();

        // If the current element is negative, add its index to the queue
        if (q.size() > 0 && q.peek() <= i + k - 1) {
            result[i] = arr[q.peek()];
        }

        // If the first element in the queue is within the current window, add it to the result
        else if (q.size() == 0) result[i] = 0;
        else result[i] = 0;
            }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, -1, 5, -4, 3, -6, 8, -2};
        int n = arr.length;
        int k= 3;
        int[] result = firstNegativeInWindows(arr, k, n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
