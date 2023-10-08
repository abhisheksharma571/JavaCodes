package Sorting_Searching;
//Find the square root of the given non-negative value x. Round it off to the nearest floor integer value.
public class squareRoot {
    static int sqrt(int x){
        int st = 0, end = x;
        int ans = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            int val = mid * mid;  //use long to avoid overflow
            if(val==x){
                return mid;
            } else if(val<x){
                ans = mid;
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 24;
        System.out.println(sqrt(x));
    }
}
