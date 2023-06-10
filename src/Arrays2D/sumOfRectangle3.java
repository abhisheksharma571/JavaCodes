package Arrays2D;

import java.util.Scanner;

//Method3-Prefix sum Over columns and Rows Both:prefix Sum in 2D Arrays:
// Given a matrix 'a' of dimensions n*m and 2 coordinates (l1,r1) and (l2,r2). Return the sum of the rectangle from (l1,r1) to (l2,r2).
public class sumOfRectangle3 {
    //calculate row wise and column wise sum
    //matrix[i][j] = sumRectangle((0,0)  (i,j))
    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        //traverse horizontally to calculate row wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        //traverse vertically to calculate column wise sum
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans =0;
        findPrefixSumMatrix(matrix);
        int sum=0, up=0, left=0, upLeft=0;
        sum= matrix[l2][r2];
        if(r1>=1)
        left= matrix[l2][r1-1];
        if(l1>=1)
        up= matrix[l1-1][r2];
        if(l1>=1 && r1>=1)
        upLeft= matrix[l1-1][r1-1];

        ans=sum - up - left + upLeft;

        return ans;
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
