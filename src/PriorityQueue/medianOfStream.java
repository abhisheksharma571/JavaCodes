package PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//Given a stream of integers, find the median of the stream using two priority queues.
public class medianOfStream {
    private static void add(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq, int element) {   //O(logN)
        if (leftPq.isEmpty()) {
            leftPq.add(element);
            return;
        }
        //agar left me jana hai
        if (element < leftPq.peek()) {
            if (rightPq.size() == leftPq.size()) {
                leftPq.add(element);
            } else {
                rightPq.add(leftPq.remove());
                leftPq.add(element);
            }
        }
        //agar right me jana hai
        else {
            if(rightPq.size() == leftPq.size()){
                leftPq.add(rightPq.remove());
                rightPq.add(element);
            }
            else {
                rightPq.add(element);
            }
        }
    }
    private static double findMedian(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq){   //O(1)
        if(leftPq.isEmpty()) return -1;
        else if(leftPq.size() - rightPq.size() == 1){
            return leftPq.peek();
        } else {
            return (double) (leftPq.peek() + rightPq.peek())/2;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> leftPq = new PriorityQueue<>(Comparator.reverseOrder());   //max heap
        PriorityQueue<Integer> rightPq = new PriorityQueue<>();    //min heap
        add(leftPq, rightPq, 15);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 10);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 5);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 20);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 25);
        System.out.println(findMedian(leftPq, rightPq));


    }
}
