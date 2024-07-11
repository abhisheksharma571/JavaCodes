package Sorting_Searching;
//Given a mountain array 'a' of length greater than 3, return the index 'i' such that arr[0]<arr[1]<...arr[i-1]<arr[i]>arr[i+1]>...arr[arr.length -1].
//This index is known as the peak index.
public class searchPeakIndex {
    static int peakIndex(int a[]){
        int st = 0, end = a.length-1;
        int ans = 0;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(a[mid]<a[mid+1]){
                ans = mid+1;
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    static int findMin(int arr[]) {
        return Math.min(arr[0], arr[arr.length-1]);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,5,3,2};
        System.out.println("Minimum element in bi-tonic array: "+findMin(arr));
        System.out.println("Peak element index: "+peakIndex(arr));
    }
}
