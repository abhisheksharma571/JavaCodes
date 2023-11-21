package PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//Given an integer array nums and an integer k, return the kth largest element in the array. Note that it is the kth largest element in the sorted array, not the kth distinct element.
public class kthLargestElement {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k = 2;
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(5);
        List<Integer> sortedArr = new ArrayList<>(arr);   //O(N)  SC
        sortedArr.sort(Comparator.reverseOrder());              //O(NlogN)  TC
        System.out.println(sortedArr.get(k-1));   //0-based indexing   //O(1)



        //better approach - we are creating priority queue(mean heap) of k elements, so at the top we will get kth largest element
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.size();i++){
            if(pq.size() == k){
                //agr top chhota tha, remove top, add element
                if(pq.peek()<arr.get(i)){
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
