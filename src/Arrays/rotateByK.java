package Arrays;

import java.util.Scanner;

//rotate an array a by k steps , where k is non-negative. k can be greater than n as well.
public class rotateByK {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] rotate(int arr[], int k){
        int n=arr.length;
        k=k%n;
        int[] ans= new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
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
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int ans[]= rotate(arr,k);
        System.out.print("Array after rotation: ");
        printArray(ans);

    }

}
