package Arrays;

import java.util.Scanner;

public class secondLargest {
    static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    static int secondMax(int[] arr){
        int max=largestElement(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondLargest=largestElement(arr);
        return secondLargest;
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
