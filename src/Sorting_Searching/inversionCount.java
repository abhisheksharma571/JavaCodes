package Sorting_Searching;

import java.util.Arrays;

public class inversionCount {
    public static long countInversions(int[] arr, int l, int r) {
        long count = 0;
        //dividing the array into two sub-arrays
        if(l<r) {
            int mid = l + (r-l)/2;
            //conquer the sub-problems using recursion
            count += countInversions(arr,l,mid);
            count += countInversions(arr,mid+1,r);
            //combine the sub-problems
            count += merge(arr,l,mid,r);
        }
        return count;
    }
    public static int merge(int[] arr, int l, int mid, int r) {
       int[] lsubarray = Arrays.copyOfRange(arr,l,mid+1);
       int[] rsubarray = Arrays.copyOfRange(arr,mid+1,r+1);
       int i = 0, j = 0, k = l;
       int swaps = 0;
       //copy the smaller elements from both the sub-arrays
       while(i<lsubarray.length && j<rsubarray.length) {
           if(lsubarray[i]<=rsubarray[j]) {
               arr[k++] = lsubarray[i++];
           }
           else {
               arr[k++] = rsubarray[j++];
               //calculate the number of swaps
               swaps += (mid+1) - (l+i);
           }
       }
       //copy the remaining elements from the left sub-array
       while(i<lsubarray.length) {
           arr[k++] = lsubarray[i++];
       }
       //copy the remaining elements from the right sub-array
       while(j<rsubarray.length) {
           arr[k++] = rsubarray[j++];
       }
       return swaps;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3,4};
        int n = arr.length;
        System.out.println("Number of inversions are: "+countInversions(arr,0,n-1));
    }
}
