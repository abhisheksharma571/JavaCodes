package Arrays2D;

import java.util.Scanner;

//Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order.
public class elementsToSpiralMatrix {
    static void printArray(int matrix[][]){
        System.out.println("Answer array is: ");
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] printSpiralOrder(int n){
        int[][] matrix = new int[n][n];
        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
        int currentElement = 1;
        while (currentElement <= n*n){
            //top row--> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && currentElement<= n*n;j++){
                matrix[topRow][j] = currentElement++;
            }
            topRow++;
            //right columns--> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && currentElement<= n*n;i++){
                matrix[i][rightCol] = currentElement++;
            }
            rightCol--;
            //bottomRow--> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && currentElement<= n*n;j--){
                matrix[bottomRow][j] = currentElement++;
            }
            bottomRow--;
            //left columns--> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && currentElement<= n*n;i--){
                matrix[i][leftCol] = currentElement++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] matrix = printSpiralOrder(n);
        printArray(matrix);
    }
}