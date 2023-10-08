package Array;

import java.util.Scanner;

public class reverseArray {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] arrRev(int[] arr) {
        int n=arr.length;
        int j=0;
        int ans[]= new int[n];
        for (int i = n-1; i >= 0; i--) {
            ans[j++]=arr[i];
        }
        return ans;
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
        int[] ans= arrRev(arr);
        printArray(ans);
    }
}
