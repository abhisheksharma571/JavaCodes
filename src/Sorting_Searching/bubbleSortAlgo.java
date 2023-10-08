package Sorting_Searching;

import java.util.Scanner;

public class bubbleSortAlgo {
    static void bubbleSort(int[] a){
        int n = a.length;
        //n-1 iterations
        for(int i=0;i<n;i++){
            boolean flag = false;     //has any swapping happened
            for(int j=0;j<n-i-1;j++){
                //last i elements are already at correct sorted position, so no need to check them
                if(a[j]>a[j+1]){
                    //swap a[j], a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;      //some swap has happened
                }
            }
            if(!flag){       //have any swaps happened?
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements: ");
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
