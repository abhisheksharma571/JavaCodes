package PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//Given an array of n integers. You are supposed to perform k operations on it. At each operation, the smallest 2 elements of the array are removed from the
//array, multiplied by each other, and the product is added back to the array.
//Return the largest element of the array after the k operations. It is guaranteed that at least one element will remain after the k operations.
public class largestAfterKOperations {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k = 2;
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(5);

        PriorityQueue<Integer> pq = new PriorityQueue<>(arr);  //O(N)
        for(int i=0;i<k;i++){    //k * logN
            int f = pq.remove();
            int s = pq.remove();
            pq.add(f*s);
        }
        while(pq.size() != 1){   //(N-k) logN
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}
