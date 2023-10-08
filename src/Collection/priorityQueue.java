package Collection;
import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue();
        //index based data adding is not allowed
        //order of insertion is not preserved, it follows min-Heap data structure like Binary Tree
        pq1.add(100);    //adds data
        pq1.add(200);
        pq1.add(30);
        pq1.add(75);
        pq1.add(50);
        pq1.add(60);
        System.out.println(pq1);
        pq1.add(30);   //duplicates of data is also allowed
        System.out.println(pq1);
//        pq1.add("PW");        //you cannot add mixed type of data and null value is also not allowed
//        System.out.println(pq1);


    }
}
