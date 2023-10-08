package Sorting_Searching;

public class binarySearch {
    static boolean search(int[] a, int target){
        int n = a.length;
        int st=0, end=n-1;
        while(st<=end){
//            int mid = (st + end)/2;
            int mid = st + (end-st)/2;     //to prevent overflow from the range of integers
            if(target == a[mid]){
                return true;
            } else if(target < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;
    }
    static boolean recursiveBinarySearch(int[] a, int st, int end, int target){
        if(st>end) return false;   //base case
//        int mid = (st+end)/2;
        int mid = st + (end-st)/2;     //to prevent overflow from the range of integers
        if(target==a[mid]){
            return true;
        } else if (target < a[mid]) {
            return recursiveBinarySearch(a,st,mid-1,target);
        } else {
            return recursiveBinarySearch(a,mid+1, end, target);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int target = 0;
        while(target!=10){
            System.out.printf("%d exists in array: %b\n",target,search(a,target));
            System.out.printf("%d exists in array: %b\n",target,recursiveBinarySearch(a,0,a.length-1,target));
            target++;
        }
    }
}
