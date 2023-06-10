package Arrays;

import java.util.Scanner;

//find the total number of pairs in the array whose sum is equal to the given value of x
public class TargetSum {
    static int sumpair(int[] arr,int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x) {
                    count++;
                }
            }
        }
            return count;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter " + n + " elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("no of pairs: " + sumpair(arr, x));
        }
}
