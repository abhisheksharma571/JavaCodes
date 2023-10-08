package Array;

import java.util.Scanner;

//Prefix sum array of an integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from l to r (both included).
//Note: The values of l and r in queries follow 1-based indexing.
public class prefixSumQueries {
    static int[] makePrefixSumArray(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
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
        int[] preSum= makePrefixSumArray(arr);
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- >0){
            System.out.println("Enter range");
            int l= sc.nextInt();
            int r= sc.nextInt();

            int ans = preSum[r] - preSum[l-1];
            System.out.println("Sum is: "+ans);
        }
    }
}
