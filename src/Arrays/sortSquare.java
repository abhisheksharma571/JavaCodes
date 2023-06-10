package Arrays;

import java.util.Scanner;

//Two Pointers:Given an array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
public class sortSquare {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapInArray(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void arrRev(int[] arr) {
        int i=0, j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int arr[]){
        int n=arr.length;
        int left=0, right = n-1;
        int ans[]=new int[n];
        int k=0;
        while(left<right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements in non-decreasing order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans=sortSquares(arr);
        System.out.println("Squares of Sorted array: ");
        arrRev(ans);
        printArray(ans);
    }
}
