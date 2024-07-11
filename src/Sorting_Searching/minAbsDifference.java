package Sorting_Searching;

public class minAbsDifference {
    static int solution(int[] a, int x){
        int n = a.length;
        if(n==0) return -1;
        int st = 0, end = n-1;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(a[mid] == x){
                ans = mid;
                break;
            } else if(a[mid]<x) {
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        //if element exist then answer will be 0
        int res = 0;
        if(ans == -1){  //element does not exist
            if(end == -1) res = Math.abs(x-a[st]);
            else if(st == n) res = Math.abs(x-a[end]);
            else res = Math.min(Math.abs(x-a[end]), Math.abs(x-a[st]));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,13,25};
        int x = 15;
        System.out.println("Minimum absolute difference: "+solution(a,x));
    }
}
