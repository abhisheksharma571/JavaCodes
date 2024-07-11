package Sorting_Searching;
//A peak element is an element that is strictly greater than its neighbours. Given a 0-indexed integer array nums, find a peak element , and return its index.
//If the array contains multiple peaks, return the index to any of the peaks.
//You may imagine that nums[-1] = nums[n] = -infinity. In other words, an element is always considered to be strictly greater than is outside the array.
public class searchPeakElement {
    static int peakElement(int a[]){
        int n = a.length;
        int st = 0, end = n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if((mid == 0 || a[mid] > a[mid-1]) && (mid == n-1 || a[mid] > a[mid+1])){
                return mid;
            }
            if(a[mid] < a[mid+1]){   //uphill
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,5,6,2};
        System.out.println("Peak element: "+peakElement(arr));
    }
}
