package Recursion;

import java.util.Scanner;

//Given an array of integers, print sums of all subsets in it. Output sums can be printed in any order
public class sumOfSubsets {
    static void subsetSum(int[] arr, int n, int idx,int sum){
        if(idx>=n){
            System.out.print(sum+" ");
            return;
        }
        //curr idx + curr ans
        subsetSum(arr,n,idx+1,sum+arr[idx]);
        //curr ans
        subsetSum(arr, n, idx+1, sum);
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
        subsetSum(arr,arr.length,0,0);
    }
}
