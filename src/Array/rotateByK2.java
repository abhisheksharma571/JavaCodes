package Array;

import java.util.Scanner;

//rotate the given array a by k steps , where k is non-negative without using extra space, k can be greater than n as well
public class rotateByK2 {
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

    static void arrRev(int[] arr,int i, int j) {
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k){
        int n= arr.length;
        k=k%n;
        arrRev(arr,0,n-k-1);
        arrRev(arr,n-k,n-1);
        arrRev(arr,0,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        rotateInPlace(arr,k);
        System.out.print("Array after rotation: ");
        printArray(arr);
    }
}
