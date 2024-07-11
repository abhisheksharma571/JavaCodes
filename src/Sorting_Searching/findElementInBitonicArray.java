package Sorting_Searching;

public class findElementInBitonicArray {
    static int peakElement(int a[]){
        int n = a.length;
        int st = 0, end = n - 1;
        while(st < end){
            int mid = st + (end - st) / 2;
            if(a[mid] < a[mid + 1]){
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return st; // 'st' will be the peak element index
    }
    static void findElement(int arr[], int target) {
        int index = peakElement(arr);
        if (index == -1 || target > arr[index]) {
            System.out.println("Element not found");
        } else {
            if (target == arr[index]) {
                System.out.println("Element found at index: " + index);
                return;
            }
            int ans = binarySearch(arr, target, 0, index - 1);
            if (ans == -1) {
                ans = binarySearchDecreasing(arr, target, index + 1, arr.length - 1);
            }
            if (ans == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index: " + ans);
            }
        }
    }

    static int binarySearch(int arr[], int target, int st, int end) {
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                ans =  mid;
                break;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int binarySearchDecreasing(int arr[], int target, int st, int end) {
        int ans = -1;
        while (st <= end){
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] > target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,4,3,2};
        int target = 5;
        findElement(arr, target);
    }
}
