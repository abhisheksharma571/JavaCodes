package Arrays;

import java.util.Scanner;

//Two pointers: Sort an array consisting of only 0s and 1s.
public class sort012 {
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
    static void sortZeroesAndOnes(int arr[]){
        int n=arr.length;
        int left=0, right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements 0s and 1s only: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortZeroesAndOnes(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
