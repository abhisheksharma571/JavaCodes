package PriorityQueue;

import java.util.*;

//Given an array A[] of N positive integers and two positive integers k1 and k2. Find the sum of all elements between k1th and k2th smallest elements of the array.
// It may be assumed that(1<=k1 < k2 < n).
public class sumOfElementBetween {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k1 = 3;
        int k2 = 6;
        arr.add(28);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);

        //brute
        //space complexity if i do not modify existing array - O(N)
        Collections.sort(arr);  //O(N logN)
        int sum = 0;
        for(int i=k1;i<k2-1;i++){   //O(K2-K1)
            sum += arr.get(i);
        }
        System.out.println(sum);

        //better
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());    //max heap
        for(int i=0;i<arr.size();i++){
            pq.add(arr.get(i));
            if(pq.size() > k2){    //smallest k2 elements
                pq.remove();
            }
        }   //O(N logK2 + (N-K2) logK2)
        pq.remove();    //remove k2th elements
        sum = 0;
        while(pq.size() != k1){     //O(K2-K1) logK2
            sum += pq.remove();
        }
        System.out.println(sum);

        //total time complexity - O(NlogK2 + (N-k2)logK2 + (K2-K1)logK2) = NlogK2
        //space complexity - O(K2)
    }
}
