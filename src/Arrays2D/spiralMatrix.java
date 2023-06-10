package Arrays2D;

import java.util.Scanner;

//Given an n*m matrix 'a', return all elements of the matrix in spiral order.
public class spiralMatrix {
    static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements = 0;
        while (totalElements< r*c){
            //top row--> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalElements< r*c;j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            //right columns--> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElements< r*c;i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            //bottomRow--> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && totalElements< r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            //left columns--> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElements< r*c;i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size of array: ");
        int r = sc.nextInt();
        System.out.print("Enter column size of array: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " + r*c + " elements for array: ");
        for (int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printSpiralOrder(arr,r,c);
    }
}
