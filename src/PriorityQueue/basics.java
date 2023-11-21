package PriorityQueue;

import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.PriorityQueue;

public class basics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();   //min heap
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());   //max heap
        pq.add(10);    //insertion
        pq.add(20);
        pq.add(15);
        pq.add(5);
        //will take the form of min heap
        System.out.println(pq.peek());    //top element - 5
        pq.remove();     //removes top element - 5
        System.out.println(pq.peek());    //top element - 10
        System.out.println(pq.remove());    //also return the value - 10
    }
}
