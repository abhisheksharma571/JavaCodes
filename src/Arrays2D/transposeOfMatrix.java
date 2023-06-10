package Arrays2D;

import java.util.Scanner;

public class transposeOfMatrix {
    static void printArray(int ans[][], int r, int c){
        System.out.println("Answer array is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeArray(int arr[][], int r, int c){
        int ans[][] = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        printArray(ans,c,r);
    }

    //this will work only for square matrix.
//    static void transposeArrayInPlace(int arr[][], int r, int c){
//        for(int i=0;i<r;i++){
//            for(int j=0;j<i;j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        printArray(arr,r,c);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size of array: ");
        int r = sc.nextInt();
        System.out.print("Enter column size of array: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.print("Enter " + r*c + " elements for array: ");
        for (int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        transposeArray(arr,r,c);
//        transposeArrayInPlace(arr,r,c);
    }
}
