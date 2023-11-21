package Heap;
//using heapify to generate a min heap
import java.util.ArrayList;
import java.util.List;

public class buildHeap {
    private static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
    private static void pushDownInMinHeap(List<Integer> heap,int index, int n){
        if(index==n) return;
        int left = (2*index) + 1;
        int right = (2*index) + 2;
        int smallest = index;

        if(left <= n && heap.get(left) < heap.get(smallest)){
            smallest = left;
        }
        if(right <= n && heap.get(right) < heap.get(smallest)){
            smallest = right;
        }
        if(smallest == index){
            return;
        }
        swap(heap,index,smallest);
        pushDownInMinHeap(heap,smallest,n);
    }
    private static void heapify(List<Integer> arr){   //build heap
        int first_Non_leaf_node = ((arr.size()-1)-1)/2;    //last element ka parent
        for(int i=first_Non_leaf_node;i>=0;i--){
            pushDownInMinHeap(arr,i,arr.size()-1);
        }
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
        heapify(heap);
        System.out.println(heap);

    }
}
