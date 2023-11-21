package Heap;

import java.util.ArrayList;
import java.util.List;

public class insertionInMinHeap {
    private static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
    private static void pushUpInMinHeap(List<Integer> heap, int i){
        //compare with parent
        int parentIndex = (i-1)/2;
        if(i==0 || heap.get(parentIndex) < heap.get(i)){
            return;
        }
        //swap
        swap(heap, i, parentIndex);
        //until root reached / correct position found
        pushUpInMinHeap(heap,parentIndex);
    }
    private static void insertInMinHeap(List<Integer> heap, int element){
        //last me add
        heap.add(element);
        int index = heap.size()-1;
        pushUpInMinHeap(heap, index);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insertInMinHeap(heap,25);
        System.out.println(heap);
    }
}
