package Assigmnent;


public class middle {
    public static void middleRowsColumns(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == arr.length / 2 || j == arr.length / 2) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {3, 4, 5, 6, 7}, {7, 6, 5, 4, 3}, {8, 7, 6, 5, 4}, {1, 2, 37, 8, 0}};
        int n = arr.length;
        middleRowsColumns(arr, n);
    }
}
