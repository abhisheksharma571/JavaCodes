package Sorting_Searching;

public class countOccurrences {
    static int countOccurrence(int[] arr, int target){
        int n = arr.length;
        int st = 0, end = n-1, fo = -1, lo = -1;
        int firstOccurredAt = firstOccurrence(arr, target, st, end, fo);
        int lastOccurredAt = lastOccurrence(arr, target, st, end, lo);
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
    int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
    int target = 5;
    System.out.println("Target "+target+" occurs "+countOccurrence(arr, target)+" times");
    }
}
