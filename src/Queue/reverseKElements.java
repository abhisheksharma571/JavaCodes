package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//reverse first K elements of a queue
public class reverseKElements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k = 3; // Change this value as needed

        // Enqueue elements into the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue: " + q);

        Stack<Integer> stack = new Stack<>();

        // Dequeue and push the first k elements onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        // Move the remaining elements to the end of the queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }

        System.out.println("Queue after reversing first " + k + " elements: " + q);
    }
}
