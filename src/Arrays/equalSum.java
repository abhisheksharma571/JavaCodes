package Arrays;

import java.util.Scanner;

//Check if we partition the array into two sub-arrays with equal sum. More formally, check that the prefix sum of a part of the array is equal to the
//suffix sum of rest of the array.
public class equalSum {
    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n+1];
            System.out.print("Enter " + n + " elements: ");
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
        System.out.println("Equal Partition possible: "+ equalSumPartition(arr));
    }
}
