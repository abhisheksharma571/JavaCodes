package Recursion;

import java.util.Scanner;

public class maxValueOfArray {
    static int maxInArray(int[] arr, int idx){
        //base case
        if(idx==arr.length-1) return arr[idx];
        //small problem->idx+1, end of the array->max->recursion
        int smallAns = maxInArray(arr,idx+1);
        //self work and final answer
        return Math.max(arr[idx],smallAns);
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
        System.out.print(maxInArray(arr,0));
    }
}
