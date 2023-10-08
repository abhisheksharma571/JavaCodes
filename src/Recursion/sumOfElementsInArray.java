package Recursion;

import java.util.Scanner;

public class sumOfElementsInArray {
    static int sumOfElements(int[] arr, int idx){
        //base case
        if(idx== arr.length) return 0;
        //recursive work
        int smallSum = sumOfElements(arr,idx+1);
        //self work
        return smallSum + arr[idx];
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
        System.out.print(sumOfElements(arr,0));
    }
}
