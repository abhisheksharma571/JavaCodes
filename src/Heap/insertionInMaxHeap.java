package Heap;

import java.util.ArrayList;
import java.util.List;

public class insertionInMaxHeap {
    private static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
    private static void pushUpInMaxHeap(List<Integer> heap, int i){
        //compare with parent
        int parentIndex = (i-1)/2;
        if(i==0 || heap.get(parentIndex) > heap.get(i)){
            return;
        }
        //swap
        swap(heap, i, parentIndex);
        //until root reached / correct position found
        pushUpInMaxHeap(heap,parentIndex);
    }
    private static void insertInMaxHeap(List<Integer> heap, int element){
        //last me add
        heap.add(element);
        int index = heap.size()-1;
        pushUpInMaxHeap(heap, index);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        System.out.println(heap);
        insertInMaxHeap(heap,40);
        System.out.println(heap);
    }
}
