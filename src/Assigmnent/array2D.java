package Assigmnent;

import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        //write a program to print the elements above the secondary diagonal in a user inputted
        //square matrix.
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j< arr.length-i-1;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//        }
        //write a program to print the elements of both the diagonals in a user inputted square matrix
        //in any order.
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j || i == n - j - 1) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//        }
        int[][] arr = {{1, 2, 4, 0},{2, 5, 7, -1},{4, 2, 6, 9}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}