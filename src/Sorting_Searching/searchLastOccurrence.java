package Sorting_Searching;

public class searchLastOccurrence {
    static int lastOccurrence(int[] a, int x){
        int n = a.length;
        int st = 0, end = n-1;
        int lo = -1;
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
        int[] a = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        int x = 6;
        System.out.println(lastOccurrence(a,x));
    }
}
