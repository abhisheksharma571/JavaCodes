package Heap;

import java.util.ArrayList;
import java.util.List;

public class deletionInMaxHeap {
    private static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
    private static void pushDownInMaxHeap(List<Integer> heap,int index){
        int n = heap.size()-1;
        if(index==n) return;
        int left = (2*index) + 1;
        int right = (2*index) + 2;
        int biggest = index;

        if(left <= n && heap.get(left) > heap.get(biggest)){
            biggest = left;
        }
        if(right <= n && heap.get(right) > heap.get(biggest)){
            biggest = right;
        }
        if(biggest == index){
            return;
        }
        swap(heap,index,biggest);
        pushDownInMaxHeap(heap,biggest);
    }
    private static void deleteFromMaxHeap(List<Integer> heap){
        swap(heap,0, heap.size()-1);
        heap.remove(heap.size()-1);
        pushDownInMaxHeap(heap,0);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        deleteFromMaxHeap(heap);
        System.out.println(heap);
    }
}
