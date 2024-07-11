package Sorting_Searching;

public class searchInSortedInfiniteArray {
    static int[] findRangeInInfiniteArray(int[] a, int target){
        int range[] = new int[2];
        int st = 0, end = 1;
        while(target > a[end]){
            st = end;
            end = end * 2;
        }
        range[0] = st;
        range[1] = end;
        return range;
    }
    static int searchElement(int[] a, int target, int st, int end){
        int ans = -1;
        while(st<=end){
//            int mid = (st + end)/2;
            int mid = st + (end-st)/2;     //to prevent overflow from the range of integers
            if(target == a[mid]){
                ans = mid;
                break;
            } else if(target < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int target = 15;
        int range[] = findRangeInInfiniteArray(arr, target);
        System.out.println("Found element at index: "+searchElement(arr, target, range[0], range[1]));
    }
}
