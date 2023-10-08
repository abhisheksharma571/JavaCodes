package Recursion;

import java.util.Scanner;

//Given an array, print all its values recursively.
public class printArrayElements {
    static void printArray(int[] arr,int idx){
        //base case
        if(idx==arr.length) return;
        //self work
        System.out.print(arr[idx]+" ");
        //recursive work
        printArray(arr,idx+1);
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
        printArray(arr,0);
    }
}
