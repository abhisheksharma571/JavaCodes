package Arrays;

import java.util.Scanner;

//Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers.
//The relative order of odd or even integers does not matter. return any array that satisfies the condition.
public class sortOddEven {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapInArray(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortOddAndEven(int arr[]){
        int n=arr.length;
        int left=0, right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
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
        sortOddAndEven(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
