package Sorting_Searching;
//Find the first occurrence of a given element x, given that the given array is sorted. If no occurrence of x is found then return -1.
public class searchFirstOccurrence {
    static int firstOccurrence(int[] a, int x){
        int n = a.length;
        int st = 0, end = n-1;
        int fo = -1;
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
    public static void main(String[] args) {
        int[] a = {1,5,5,5,6,7,8};
        int x = 5;
        System.out.println(firstOccurrence(a,x));
    }
}
