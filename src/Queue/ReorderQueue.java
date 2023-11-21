package Queue;
//reorder queue(Interleave 1st half with 2nd half) using stack
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void interleaveQueue(Queue<Integer> queue) {
        int size = queue.size();
        int halfSize = size / 2;
        Stack<Integer> stack = new Stack<>();

        // Push the first half of the queue into a stack
        for (int i = 0; i < halfSize; i++) {
            stack.push(queue.remove());
        }  //5 6 7  8                     stack 4 3 2 1

        // Add stack element into queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }  // 5 6 7 8  4 3 2 1

        //push second half of the queue into stack
        for (int i = 0; i < halfSize; i++) {
            stack.push(queue.remove());
        }   //4 3 2 1                    stack 8 7 6 5

        // one by one, pahle stack se fir queue se
        for (int i = 0; i < halfSize; i++) {
            queue.add(stack.pop());
            queue.add(queue.remove());
        }    //8 4 7 3 6 2 5 1

        //reverse the queue
        while(queue.size()>0){
            stack.push(queue.remove());
        }
        while(stack.size()>0){
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 8; i++) {
            queue.add(i);
        }

        System.out.println("Original Queue: " + queue);
        interleaveQueue(queue);
        System.out.println("Reordered Queue: " + queue);
    }
}

