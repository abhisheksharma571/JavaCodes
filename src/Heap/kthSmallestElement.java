 package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//Given an array arr[] and an integer K where K is the smaller than size of array, the task is to find the Kth smallest element in the given array.
//It is given that all array elements are distinct.
public class kthSmallestElement {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k = 3;
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(5);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.size();i++){
            if(pq.size() == k){
                //agr top bada tha, remove top, add element
                if(pq.peek()>arr.get(i)){
                    pq.remove();
                    pq.add(arr.get(i));
                }
                continue;
            }
            //for normal case
            pq.add(arr.get(i));
        }
        System.out.println(pq.peek());
    }
}
