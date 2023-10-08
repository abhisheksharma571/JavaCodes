package Sorting_Searching;
//Given the rotated array of integers, which contains distinct elements, and an integer target, return the index of target if it is in the array. Other-wise return -1;
public class searchInRotatedSorted {
    static int search(int[] a, int target){
        int st = 0, end = a.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] == target){
                return mid;
            }
            else if (a[mid] < a[end]){ // mid to end is sorted
                if(target > a[mid] && target <= a[end]){
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            } else { // st to mid is sorted
                if(target >= a[st] && target < a[mid]){
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    // duplicate elements
    static boolean search_(int[] a, int target){
        int st = 0, end = a.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] == target){
                return true;
            }
            else if(a[st] == a[mid] && a[end] == mid){
                st++;
                end--;
            }
            else if (a[mid] <= a[end]){ // mid to end is sorted
                if(target > a[mid] && target <= a[end]){
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            } else { // st to mid is sorted
                if(target >= a[st] && target < a[mid]){
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,6,7,1,2};
//        int[] a = {1, 1, 1, 2, 2, 3, 1};
        int target = 2;
        System.out.println(search(a, target));
//        System.out.println(search_(a, target));
    }
}
