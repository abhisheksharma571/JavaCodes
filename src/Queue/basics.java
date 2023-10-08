package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);    //front
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);    //rear
        System.out.println(q.size());
        System.out.println(q);
        q.remove();     //remove first element
        System.out.println(q);
        q.poll();       //same as remove()
        System.out.println(q);
        System.out.println(q.element());    //return first element
        System.out.println(q.peek());       //same as element()
    }
}
