package Arrays2D;

import java.util.Scanner;

public class multiplicationOfMatrix {
    static void printArray(int ans[][], int r, int c){
        System.out.println("Answer array is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiplicationArray(int arr1[][], int arr2[][], int r1, int c1, int r2, int c2){
        if(c1!=r2){
            System.out.println("Wrong input- Multiplication not possible.");
            return;
        }
        int ans[][] = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
               for(int k=0;k<c1;k++){
                   ans[i][j] += arr1[i][k] * arr2[k][j];
               }
            }
        }
        printArray(ans,r1,c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size of array1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter column size of array1: ");
        int c1 = sc.nextInt();
        int arr1[][] = new int[r1][c1];
        System.out.print("Enter " + r1*c1 + " elements for first array: ");
        for (int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter row size of array2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter column size of array2: ");
        int c2 = sc.nextInt();
        System.out.print("Enter " + r2*c2 + " elements for second array: ");
        int arr2[][] = new int[r2][c2];
        for (int i=0; i<r2;i++) {
            for(int j=0;j<c2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        multiplicationArray(arr1,arr2,r1,c1,r2,c2);
    }
}
