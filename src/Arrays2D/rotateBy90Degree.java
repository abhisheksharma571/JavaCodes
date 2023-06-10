package Arrays2D;

import java.util.Scanner;

//Given a square matrix, turn it by 90 degree in a clockwise direction without using any extra space.
public class rotateBy90Degree {
    static void printArray(int ans[][], int n){
        System.out.println("Answer array is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeArrayInPlace(int arr[][], int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverseArray(int arr[]){
        int i=0, j= arr.length -1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int arr[][],int n){
        transposeArrayInPlace(arr,n,n);
        //reverse each row of transposed matrix
        for(int i=0;i<n;i++){
            reverseArray(arr[i]);
        }
        printArray(arr,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.print("Enter " + n*n + " elements for array: ");
        for (int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr,n);
    }
}
