package Arrays;

import java.util.Scanner;

//Two pointers: Sort an array consisting of only 0s and 1s.
public class sort01 {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortZeroesAndOnes(int arr[]){
        int n=arr.length;
        int zeroes=0;
        //count no of zeroes
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        //0 to zeroes-1:0 , zeroes t n-1: 1
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else {
                arr[i]=1;
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
