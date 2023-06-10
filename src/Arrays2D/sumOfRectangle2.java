package Arrays2D;

import java.util.Scanner;

//Method2-Pre-calculating the horizontal sum for each row in the Matrix:prefix Sum in 2D Arrays:
// Given a matrix 'a' of dimensions n*m and 2 coordinates (l1,r1) and (l2,r2). Return the sum of the rectangle from (l1,r1) to (l2,r2).
public class sumOfRectangle2 {
    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        //traverse horizontally to calculate row wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum =0;
        findPrefixSumMatrix(matrix);
        for(int i=l1;i<=l2;i++){
            //r1 to r2 sum for row i
            if(r1>=1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else
                sum += matrix[i][r2];
        }
        return sum;
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
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangular sum: "+findSum(arr,l1,r1,l2,r2));
    }
}
