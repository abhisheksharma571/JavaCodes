package Sorting_Searching;

public class perfectSquare {
    static boolean square(int x){
        int st = 0, end = x;
        while(st <= end){
            int mid = st + (end-st)/2;
            int val = mid * mid;  //use long to avoid overflow
            if(val==x){
                return true;
            } else if(val<x){
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int x = 16;
        System.out.println(square(x));
    }
}
