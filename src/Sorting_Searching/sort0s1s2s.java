package Sorting_Searching;
//Given an array of size N containing only 0s, 1s and 2s; sort the array in ascending order.
public class sort0s1s2s {
    static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static void sort012(int[] a){
        int lo=0, mid=0, hi=a.length-1;
        //explore the unknown region
        while(mid<=hi){
            if(a[mid] == 0){
                swap(a,mid,lo);
                mid++;
                lo++;
            } else if(a[mid] == 1){
                mid++;
            } else {
                swap(a,mid,hi);
                hi--;
            }
        }
    }
    static void display(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] num = {2,2,0,0,1,1,2,0,1,0};
        sort012(num);
        display(num);
    }
}
