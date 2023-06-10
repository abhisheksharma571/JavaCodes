package Arrays;

import java.util.Scanner;

//Prefix Sum:Given an integer array 'a', return the prefix sum/running sum in the array.
public class runningSum {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] makePrefixSumArray(int arr[]){
        int n=arr.length;
        int pref[] = new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
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
        int[] pref=makePrefixSumArray(arr);
        System.out.println("Running sum of array: ");
        printArray(pref);
    }
}
