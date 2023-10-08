package Sorting_Searching;

import java.util.Scanner;

public class selectionSortAlgo {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){     //i represent the current index
            //find the minimum element in the unsorted part of array
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap current element and minimum element -> current index i will have correct element
            //arr[minIndex], arr[i]
            if(minIndex!=i){      //if both are equal, then there is no need to swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements: ");
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
