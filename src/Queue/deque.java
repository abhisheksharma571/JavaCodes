package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.addFirst(2);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.add(6);   //add last
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);   //remove first
//        dq.removeAll(dq);    //remove everything
        dq.addLast(7);
        dq.addLast(8);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeLastOccurrence(4);
        System.out.println(dq);
        System.out.println(dq.getClass());
    }
}
