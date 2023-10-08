package Sorting_Searching;

import java.util.Scanner;

/*Search the target value in a 2D integer matrix of dimensions n*m and return true if found, else return false. This matrix has the following properties.
1.Integers in each row are sorted from left to right.
2.The first integer of each row is greater than the last integer of the previous row.
*/
public class searchIn2D {
    static boolean searchMatrix(int[][] a, int target){
        //number of rows = n, number of columns = m
        int n = a.length, m = a[0].length;
        int st = 0, end = n*m-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int midElement = a[mid/m][mid%m];
            if(midElement==target) return true;
            if(target<midElement){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3,},
                    {4,5,6},
                    {7,8,9}};
        int target = 6;
        System.out.println(searchMatrix(a,target));
    }
}
