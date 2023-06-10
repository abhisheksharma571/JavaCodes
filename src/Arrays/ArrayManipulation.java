package Arrays;

import java.util.Scanner;

//find the unique number in the given array where all the  elements are being repeated twice with one being unique
public class ArrayManipulation {

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
        System.out.print("Enter " + n + "positive elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("unique element: " + uniqueElement(arr));
    }

}
