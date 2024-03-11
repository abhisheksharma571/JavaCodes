package Array;

import java.util.Scanner;

//find the unique number in the given array where all the  elements are being repeated twice with one being unique
public class ArrayManipulation {

    // XOR of two same numbers is always 0 i.e. a ^ a = 0.
    //XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.
    static int optimalApproachUniqueElement(int[] arr){
        int n = arr.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }

    static int uniqueElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " positive elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("unique element: " + uniqueElement(arr));
        System.out.print("unique element: " + optimalApproachUniqueElement(arr));
    }

}
