package Arrays;

import java.util.Scanner;

public class secondLargest2 {
    static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        return secMax;
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
        System.out.print("Second largest element: " + secondMax(arr));
    }
}

