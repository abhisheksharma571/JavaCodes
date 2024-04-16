package Sorting_Searching;

public class count1s {
    static int countOnes(int arr[]){
        int n = arr.length;
        int st = 0, end = n-1, fo = -1, lo = -1;
        int firstOccurredAt = firstOccurrence(arr, 1, st, end, fo);
        int lastOccurredAt = lastOccurrence(arr, 1, st, end, lo);
        int count = lastOccurredAt - firstOccurredAt + 1;
        return count;
    }
    static int firstOccurrence(int[] a, int x, int st, int end, int fo){
        while(st<=end){
            int mid = st + (end-st)/2;
            if(a[mid] == x){
                fo = mid;
                end = mid-1;
            } else if(x<a[mid]) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return fo;
    }
    static int lastOccurrence(int[] a, int x, int st, int end, int lo){
        while(st<=end){
            int mid = st + (end-st)/2;
            if(a[mid] == x){
                lo = mid;
                st = mid+1;
            } else if(x<a[mid]) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        System.out.println("Output 1: " + countOnes(arr1)); // Output: 6

        int[] arr2 = {0, 0, 0, 0, 0, 1, 1};
        System.out.println("Output 2: " + countOnes(arr2)); // Output: 2
    }
}
