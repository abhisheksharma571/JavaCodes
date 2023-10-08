package Collection;
import java.util.*;
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        //can't add index based data like ArrayList
        ad1.add(100);  //adds data
        ad1.add(200);
        System.out.println(ad1);

        //ArrayDeque follow Double Ended Queue
        ad1.addFirst(50);     //adds data from front
        ad1.addLast(300);     //adds data from last
        System.out.println(ad1);

        ad1.add(200);       //duplicates of data is allowed
        System.out.println(ad1);
        ad1.offer(500);     //works same as add(), but in offer it is not mandatory that it add
        ad1.offerLast(600);
        ad1.offerFirst(25);
        System.out.println(ad1);
    }
}
