package Arrays2D;

import java.util.Scanner;

//Given an integers n, return the first  n rows of pascal's triangle. In pascal's triangle, each number is the sum of twp numbers directly above it.
public class pascalTriangle {
    static void printArray(int matrix[][]){
        System.out.println("Answer array is: ");
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int ans[][] = new int[n][];
        for(int i=0;i<n;i++){
            //ith row has (i+1) columns
            ans[i] = new int[i+1];
            //1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for(int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int [][] ans = pascal(n);
        printArray(ans);
    }
}
